<html>
<head>
    <!-- Dynamically reference the CSS file -->
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<h2>Sample Form</h2>
<!-- Dynamically set the form action -->
<form action="<%=application.getContextPath()%>/Submit" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name"><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email"><br><br>

    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password"><br><br>

    <input type="submit" value="Submit">
</form>


</body>
</html>
