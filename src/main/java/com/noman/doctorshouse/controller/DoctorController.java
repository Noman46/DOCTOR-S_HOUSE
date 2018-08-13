/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.controller;

import com.noman.doctorshouse.command.DoctorLoginCommand;
import com.noman.doctorshouse.command.PrescriptionCommand;
import com.noman.doctorshouse.domain.Doctor;
import com.noman.doctorshouse.domain.Prescription;
import com.noman.doctorshouse.service.DoctorService;
import com.noman.doctorshouse.service.PrescriptionService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Noman Ibrahim
 */
@Controller
public class DoctorController {

    @Autowired
    private DoctorService ds;

    @Autowired
    private PrescriptionService ps;

    @RequestMapping(value = {"doctor/login"})
    public String docLogin(Model m) {
        DoctorLoginCommand cmd = new DoctorLoginCommand();
        m.addAttribute("command", cmd);
        return "doclogin"; // It will return Home page as ajsp view
    }

    @RequestMapping(value = "/doctor/logindo", method = RequestMethod.POST)
    public String loginDo(@ModelAttribute("command") DoctorLoginCommand cmd, Model M, HttpSession session) {

        try {
            Doctor loggedinDoctor = ds.docLogin(cmd.getDoctorId(), cmd.getPassword());
            if (loggedinDoctor == null) {
                M.addAttribute("msg", "wrogn");
                return "fail";

            } else {
                //M.addAttribute("msg", "fuck you did this");
                addDoctorInSession(loggedinDoctor, session);
                return "redirect:/prescriptionInputByDoctor";
            }

        } catch (NullPointerException exception) {
            return "fail";
        }

    }

    @RequestMapping(value = {"/doctor/savePrescription"})
    public String registrationDo(@ModelAttribute("command") PrescriptionCommand cmd, Model m,HttpSession session) {
       String doctorId=(String) session.getAttribute("doctorId");
        
        Prescription p = cmd.getP();
        p.setDoctorId(doctorId);
        ps.prescriptionSave(p);

        return "success";
    }

    //+++++++++++++++++++++++++++ PRESCRIPTIOPN FORM +++++++++++++++++++++++
    @RequestMapping(value = {"/prescriptionInputByDoctor"})
    public String presSave(Model m) {
        PrescriptionCommand cmd = new PrescriptionCommand();
        m.addAttribute("command", cmd);
        return "prescriptionInput";
    }

    public void addDoctorInSession(Doctor d, HttpSession session) {
        session.setAttribute("Doctor", d);
        session.setAttribute("doctorId", d.getDoctorId());

    }

}
