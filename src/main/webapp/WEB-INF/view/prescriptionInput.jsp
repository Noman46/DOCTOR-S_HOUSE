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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <style>
            body {
                height: 100%;
                background-color: #7fffd4;
            }

            .container {

                width:70%;
                display: flex;
                justify-content: center;
                color:white;
                background-color: #558164;
                border:3px solid black;
            }
            .t{
                margin-top: 60px;
            }
            .hed{
                display: flex;
                justify-content: center;
                color:red;
            }






        </style>


    </head>

    <body>
        <h1 class="hed"><i class="fa fa-medkit"></i> &nbsp;PRESCRIPTION</h1>
        <div class="container">

            <div class="t">
                <s:url var="url_presSave" value = "/doctor/savePrescription"/>
                <f:form action="${url_presSave}" modelAttribute="command">
                    <table class="table table-striped table-dark">

                        <tbody>
                            <tr>
                                <th class="text-success">Name</th>
                                <td class="col-md-2"><f:input path="p.studentName" style="resize: horizontal;width: 350px;"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Student-ID</th>
                                <td class="col-md-2"><f:input path="p.studentId"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Age</th>
                                <td class="col-md-2"><f:input path="p.age"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Disease</th>
                                <td class="col-md-2  text-danger"><f:input path="p.disease" style="resize: horizontal;width: 350px;"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Medicine</th>
                                <td class="col-md-2  text-danger"><f:input path="p.medicine" style="resize: horizontal;width: 350px;"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Strength</th>
                                <td class="col-md-2  text-danger"><f:input path="p.strength" style="resize: horizontal;width: 350px;"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Route</th>
                                <td class="col-md-2"><f:input path="p.route"/></td>
                            </tr>

                            <tr>
                                <th class="text-success">Frequency</th>
                                <td class="col-md-2  text-danger"><f:input path="p.frequency"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Start-Date</th>
                                <td class="col-md-2"><f:input path="p.startDate"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">End-date</th>
                                <td class="col-md-2"><f:input path="p.endDate"/></td>
                            </tr>
                            <tr>
                                <th class="text-success">Remark</th>
                                <td class="col-md-2 text-warning"><f:input path="p.remarks" style="resize: horizontal;width: 750px;"/></td>
                            </tr>

                        </tbody>
                    </table>
                    <f:button type="submit" class="btn btn-primary btn-block bt">Save</f:button>
                </f:form>


            </div>
        </div>


    </body>
</html>

