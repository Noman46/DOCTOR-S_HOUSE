<%-- 
    Document   : registration
    Created on : Aug 9, 2018, 12:10:46 AM
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
        <s:url var="url_css" value="/static/css/style.css"/>
        <link href ="${url_css}" rel ="stylesheet" type="text/css"/>
        <title>Student Registration</title>
       
    </head>
    <body>

        <div class="simple_form">
            <s:url var="url_reg_form" value="/student/Registration"/>
            <f:form action="${url_reg_form}" modelAttribute="command" id="reg">
                <h1  style="color:red;">Registration</h1>
                <f:input path="studentId" placeholder="Enter your name" class="box"/>

                </br>
                </br>
                </br>

                <f:input path="name" placeholder="Enter your phone number" class="box"/>
                </br>
                </br
                </br>
                <f:input path="phone" placeholder="Enter your user name" class="box"/>
                </br>
                </br>
                </br>
                <f:password path="email" placeholder="Enter your password" class="box"/>
                </br>
                </br>
                </br>
                <f:password path="address" placeholder="Enter your password" id="box"/>
                </br>
                </br>
                </br>
                <f:password path="dept" placeholder="Enter your password" class="box"/>
                </br>
                </br>
                </br>
                <f:password path="session" placeholder="Enter your password" class="box"/>
                </br>
                </br>
                </br>
                <f:password path="password" placeholder="Enter your password" class="box"/>
                </br>
                </br>
                </br>
                <f:button id="butt">Register</f:button>
            </f:form>
        </div>
        <div id="footer">
            
        </div>

    </body>
</html>

