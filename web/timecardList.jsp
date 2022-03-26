<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timecard List</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>List of Timecards</h1>
    <p1>${salary}</p1>
        <table>
            <tr>
                <th>Employee</th>
                <th class="left">Hours</th>
                <th class="left">Overtime Hours</th>
            </tr>
            <c:forEach var="card" items="${timecards}">
                <tr>
                    <td>${card.employeeId}</td>
                    <td class = "left">${card.hoursWorked}</td>
                    <td class = "left">${card.overtimeHours}</td>
                    <td>
                        <form action="timecard" method="post">
                            <input type="hidden" name="option" value="edit">
                            <input type="hidden" name="timecardId" value="<c:out value='${card.timecardId}'/>">
                            <input type="submit" value="Edit">
                        </form>
                            <form action="deletetimecard.jsp" method="post">
                                <input type ="hidden" name="option" value="delete">
                                <input type="submit" value="Delete">
                            </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <<form action="newtimecard.jsp" method="post">
            <input type="hidden" name="option" value="add">
            <input type="submit" value="Add new Timecard">
        </form>
    </body>
</html>
