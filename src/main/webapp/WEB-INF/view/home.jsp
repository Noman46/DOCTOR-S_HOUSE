<%-- 
    Document   : home
    Created on : Aug 7, 2018, 4:37:50 PM
    Author     : Noman Ibrahim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>    
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="static/css/styleHome.css">
        <title>HOME || Doctor's House</title>
    </head>
    <body>

        <div class="navbar">
            <div class="navbar__header">
                <img src="static/images/doctorlogo.jpg" alt="medical center" class="navbar__logo" >
                <div class="navbar__btn">
                    <div class="bar bar1"></div> 
                    <div class="bar bar2"></div>
                    <div class="bar bar3"></div>
                </div>
            </div>
            <ul class="navbar_link">
                <s:url var="url_log" value="student/loginPage"></s:url>
                <s:url var="url_reg" value="student/Registration"></s:url>
                <s:url var="url_logout" value="student/logout"></s:url>
                <s:url var="url_Doctor_schedule" value="doctor/Schedule"></s:url>
                <s:url var="url_prescription" value="student/prescription"></s:url>


                <li><a href="#" class="navbar_single_link"><i class="fa fa-heartbeat"></i> Home</a></li>
                <li><a href="${url_reg}" class="navbar_single_link"><i class="fa fa-hospital-o"></i> Registration</a></li> 
                <li><a href="${url_log}" class="navbar_single_link"><i class="fa fa-plus-square"></i> Login</a></li> 
                <li><a href="${url_logout}" class="navbar_single_link"><i class="fa fa-motorcycle"></i> Logout</a></li> 
                <li><a href="${url_Doctor_schedule}" class="navbar_single_link"><i class="fa fa-user-md"></i> Doctor's Schedule</a></li> 
                <li><a href="${url_prescription}" class="navbar_single_link"><i class="fa fa-file"></i> Prescription</a></li> 

            </ul>

        </div>
        <script src="webjars/jquery/3.2.1/jquery.min.js"></script>
        <header>
            <h1>MEDICAL CENTER</h1>
            <h2>MAWLANA BHASHANI SCIENCE AND TECHNOLOGY UNIVERSITY</h2>
            <br>
            <br>
            
            <p>Register yourself for claiming the services provided by the medical center<br>You can keep track your prescription from anywhere.<br>It will help you to purchase medicine from any dispensary</p>
        </header>

        <script type="text/javascript" src="static/js/main.js">

        </script>


    </body>
</html>
