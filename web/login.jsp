<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payroll Login</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Company Login</h1>
    <p1>${message}</p1>
            <form action="login" method="post">
            <label class="pad_top">User ID:</label>
            <input type="userID" name="userID" value="${userID}" required><br>
            <label class="pad_top">Password:</label>
            <input type="Password" name="password" value="${password}" required><br>
            <input type="submit" value="Log In" style="margin-left">
        </form>
    </body>
</html>