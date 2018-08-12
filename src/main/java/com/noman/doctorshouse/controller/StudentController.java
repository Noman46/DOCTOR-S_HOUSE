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
import com.noman.doctorshouse.service.PrescriptionService;
import com.noman.doctorshouse.service.StudentService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Noman Ibrahim
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private PrescriptionService prescriptionService;
//++++++++++++++++++++++++++ RETURN INDEX / STARTING / HOME PAGE+++++++++++++++++
    // Index or Landing page. 

    @RequestMapping(value = {"/", "/index"})
    public String index() {

        return "home"; // It will return Home page as ajsp view
    }

    // +++++++++++++++++++++++++ RETURN LOGIN PAGE ++++++++++++++++++++++++++++++++++   
    //Return Login page after clicking Login 
    @RequestMapping(value = {"student/loginPage"})
    public String loginReturn(Model m) {
        LoginCommand cmd = new LoginCommand();
        m.addAttribute("command", cmd);
        return "login";
    }

    //+++++++++++++++++++++++++++ RETURN DOCTOR'S SCHEDULE +++++++++++++++++++++++
    //Return Doctor;s Schedule page after clicking Login 
    @RequestMapping(value = {"doctor/Schedule"})
    public String scheduleReturn() {
        return "Schedule";
    }

    //+++++++++++++++++++++++++++ RETURN SUCCESS PAGE +++++++++++++++++++++++
    @RequestMapping(value = {"/student/registrationdo"})
    public String registrationDo(@ModelAttribute("command") RegistrationCommand cmd, Model m) {
        Student s = cmd.getS();
        studentService.register(s);
        return "success";
    }

    //+++++++++++++++++++++++++++ LOGIN BUSINESS +++++++++++++++++++++++
    @RequestMapping(value = "/student/logindo", method = RequestMethod.POST)
    public String loginDo(@ModelAttribute("command") LoginCommand cmd, Model M, HttpSession session) {

        try {
            Student loggedinStudent = studentService.login(cmd.getStudentId(), cmd.getPassword());
            if (loggedinStudent == null) {
                M.addAttribute("msg", "wrogn");
                return "fail";

            } else {
                //M.addAttribute("msg", "fuck you did this");
                addStudentInSession(loggedinStudent, session);
               return "redirect:/listOfPrescription";
            }

        } catch (NullPointerException exception) {
            return "fail";
        }

    }

    @RequestMapping(value = {"/listOfPrescription"})
    public String returnListPrescription(Model m, HttpSession session) {
        String studentId= (String) session.getAttribute("studentId");
        
        m.addAttribute("prescriptionList", prescriptionService.findAllPrescriptions(studentId));
        return "prescription"; // return JSP /WEB-INF/view/dashboard_user.jsp
    }

    //+++++++++++++++++++++++++++ RETURN REGISTRATION PAGE +++++++++++++++++++++++
    //Return Registration page after clicking Login 
    @RequestMapping(value = {"student/Registration"})
    public String registrationReturn(Model m) {
        RegistrationCommand cmd = new RegistrationCommand();
        m.addAttribute("command", cmd);

        return "registration";
    }

    //+++++++++++++++++++++++++++ SAVE PRESCRIPTION +++++++++++++++++++++++
    @RequestMapping(value = {"/doctor/savePrescription"})
    public String savePrescription(@ModelAttribute("command") PrescriptionCommand cmd, Model m) {
        Prescription prescription = cmd.getP();

        // First Make A prescriptionSave in service class.
        // Then call It from here.
        // As of now we don t have session, set manually DoctorId
        return "success";
    }

    //+++++++++++++++++++++++++++ DETAILS OF PRESCRIPTION +++++++++++++++++++++++
    @RequestMapping(value = {"/prescriptionDetails"})
    public String pres(Model m, HttpSession session, @RequestParam("pId") Integer preId) {
        session.setAttribute("aPrescriptionId", preId);
        Prescription pre = prescriptionService.findById(preId);
        m.addAttribute("aPrescription", pre);
       
        
        return "presDetails";
    }
    //+++++++++++++++++++++++++++ PRESCRIPTIOPN FORM +++++++++++++++++++++++

    @RequestMapping(value = {"/prestest2"})
    public String presSave(Model m) {
        PrescriptionCommand cmd = new PrescriptionCommand();
        m.addAttribute("command", cmd);
        return "prescriptionInput";
    }

    public void addStudentInSession(Student s, HttpSession session) {
        session.setAttribute("Student", s);
        session.setAttribute("studentId", s.getStudentId());
        session.setAttribute("studentName", s.getName());
    }
}
