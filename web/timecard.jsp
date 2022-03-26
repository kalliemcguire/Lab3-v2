<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timecard Editor</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Edit existing timecard</h1>
    <p1>Editing Timecard ${card.timecardId} for ${employee.firstName} ${employee.lastName}</p1
                </tr>
            <c:forEach var="card" items="${timecards}">
                <tr>
                    <td>
                        <form action="" method="post">
                            <input type="hidden" name="option" value="edit">
                            <input type="text" name="hoursWorked" label="Hours Worked" value="<c:out value='${card.hoursWorked}'/>" id="hoursWorked">
                            <input type=text name="overtimeHours" label="Overtime Hours" value="<c:out value='${card.overtimeHours}'/>" id="overtimeHours">
                            <input type="submit" value="Update">
                        </form>
                    </td>
                    <td><c:out value='${card.hoursWorked}'/></td>
                    <td>${card.overtimeHours}</td>
                    <td>
                        <form action="timecard" method="post">
                            <input type="hidden" name="option" value="edit">
                            <input type="hidden" name="timecardId" value="<c:out value='${card.timecardId}'/>">
                            <input type="submit" value="Edit">
                        </form>
                    </td>
                </tr>
            </c:forEach>
    </body>
</html>
