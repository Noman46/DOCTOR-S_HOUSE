/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Noman Ibrahim
 */

@Controller
public class TestController {
    
    @RequestMapping(value = {"/test"})
    public String helloWorld(){
    
        return "hello"; // ---> WEB-INF/view/hello.jsp
    }
}
