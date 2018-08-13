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

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <style>
            .bg{
                background: url('../static/images/bg4.jpeg') no-repeat; width:100%; height: 100vh;background-position: center;}
            .from-container{
                ; 
                padding: 30px 40px;
                margin-top: 30vh;
                box-shadow: 0 2px 4px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
                transition: all 0.5s cubic-bezier(.25,.8,.25,1);
                background-color: black;
                opacity: 0.9;}
            .form-control:focus{
                border-color: #cccccc;
                -webkit-box-shadow: none;
                box-shadow: none;
            }

            .from-container:hover {
                box-shadow: -5px 5px 15px white, 5px -5px 15px white;
            }

        </style>

        <title>Doctor Login</title>

    </head>


    <body>
        <div class="container-fluid bg">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12"></div>
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <!-- Form Start -->
                    <s:url var="url_logindo" value="/doctor/logindo"></s:url>
                    <f:form action="${url_logindo}" modelAttribute="command"  class="from-container">
                        <div class="form-group">
                            <label for="doctorId">Your Doctor ID</label>
                            <f:input path="doctorId" class="form-control" id="exampleInputEmail1" placeholder="Student-ID"/>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <f:password path="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
                        </div>
                        <br>
                        <f:button type="submit" class="btn btn-success btn-block bt">Login</f:button>
                    </f:form>

                    <!-- Form End -->
                </div>
                <div class="col-md-4 col-sm-4 col-xs-12"></div>

            </div>
        </div>
    </body>
</html>


