/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.controller;

import com.noman.doctorshouse.command.LoginCommand;
import com.noman.doctorshouse.command.PrescriptionCommand;
import com.noman.doctorshouse.command.RegistrationCommand;
import com.noman.doctorshouse.domain.Prescription;
import com.noman.doctorshouse.domain.Student;
import com.noman.doctorshouse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Noman Ibrahim
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Index or Landing page. 
    @RequestMapping(value = {"/", "/index"})
    public String index() {

        return "home"; // It will return Home page as ajsp view
    }

    //Return Login page after clicking Login 
    @RequestMapping(value = {"student/loginPage"})
    public String loginReturn(Model m) {
        LoginCommand cmd = new LoginCommand();
        m.addAttribute("command", cmd);
        return "login";
    }

    //Return Registration page after clicking Login 
    @RequestMapping(value = {"student/Registration"})
    public String registrationReturn(Model m) {
        RegistrationCommand cmd = new RegistrationCommand();
        m.addAttribute("command", cmd);

        return "registration";
    }

    //Return Doctor;s Schedule page after clicking Login 
    @RequestMapping(value = {"doctor/Schedule"})
    public String scheduleReturn() {
        return "Schedule";
    }

    //Return prescription page after clicking Login 
    @RequestMapping(value = {"student/prescription"})
    public String prescriptionReturn() {
        return "prescription";
    }

    @RequestMapping(value = {"/student/registrationdo"})
    public String registrationDo(@ModelAttribute("command") RegistrationCommand cmd, Model m) {
        Student s = cmd.getS();
        studentService.register(s);
        return "success";
    }

    @RequestMapping(value = {"/student/logindo"})
    public String loginDo(@ModelAttribute("command") LoginCommand cmd, Model M) {

        try {
            Student loggedinStudent = studentService.login(cmd.getStudentId(), cmd.getPassword());
            if (loggedinStudent == null) {
                M.addAttribute("msg", "wrogn");
                return "fail";

            } else {
                M.addAttribute("msg", "fuck you did this");
                return "success";
            }

        } catch (NullPointerException exception) {
            return "fail";
        }

    }
     @RequestMapping(value = {"/doctor/savePrescription"})
    public String savePrescription(@ModelAttribute("command") PrescriptionCommand cmd, Model m){
           Prescription prescription = cmd.getP();
           
           // First Make A prescriptionSave in service class.
           // Then call It from here.
           // As of now we don t have session, set manually DoctorId
           return "success";    
    }

    @RequestMapping(value = {"/prestest"})
    public String pres() {

        return "presDetails";
    }

    @RequestMapping(value = {"/prestest2"})
    public String presSave(Model m) {
        PrescriptionCommand cmd = new PrescriptionCommand();
        m.addAttribute("command", cmd);
        return "prescriptionInput";
    }
}
