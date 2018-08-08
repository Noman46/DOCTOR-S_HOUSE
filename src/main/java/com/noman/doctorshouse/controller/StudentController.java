/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.controller;


import com.noman.doctorshouse.command.RegistrationCommand;
import com.noman.doctorshouse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String loginReturn() {
        
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

}
