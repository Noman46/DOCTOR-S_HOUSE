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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <style>
            body{
                background-color: #7fffd4;
            }
            .hea{
                text-align: center;
                color: green;
            }
        </style>
    </head>

    <body>

        <div class="container-fluid">
            <div class= "hea">
                <h1>Prescription</h1>


            </div>

            <div> 
                <table class="table table-sm table-dark">
                    <tbody>
                        <tr>
                            <td align="center"><h4 class="text-success">Hi!&nbsp;  <b class="text-danger">${sessionScope.studentName}...</b>&nbsp; This is your prescription list. Click view to see the full prescription</h4></td>
                        </tr>
                </table>
                <table class="table table-hover table-dark">
                    <thead>
                        <tr>
                            <th scope="col" class="text-danger">SERIAL</th>
                            <th scope="col" class="text-success font-weight-bold">DATE</th>
                            <th scope="col" class="text-success font-weight-bold">DISEASE</th>
                            <th scope="col" class="text-success font-weight-bold">MEDICINE</th>
                            <th scope="col" class="text-success font-weight-bold">FREQUENCY</th>
                            <th scope="col" class="text-success font-weight-bold">ACTION</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:if test="${empty prescriptionList }">
                            <tr>
                                <td colspan="6" align="center"><h3 class="text-danger">You Have Not Visited The Doctors Yet. Good For You </h3></td>
                            </tr>
                        </c:if>
                        <c:forEach var="p" items="${prescriptionList}" varStatus="st">

                            <tr>
                                <td>${st.count}</td>
                                <td>${p.startDate}</td>
                                <td>${p.disease}</td>
                                <td>${p.medicine}</td>
                                <td>${p.frequency}</td>
                                <s:url var="url_view" value="/prescriptionDetails">
                                    <s:param name="pId" value="${p.preId}"/> 
                                </s:url>
                                <td><a href="${url_view}"><button class="btn btn-success">VIEW</button></a></td>
                            </tr>


                        </c:forEach>


                    </tbody>
                </table>
            </div>        

        </div>


    </body>
</html>

