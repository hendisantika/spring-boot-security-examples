<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Security Example</title>
    <link href="/bootstrap.min.css" rel="stylesheet">
    <script src="/jquery-2.2.1.min.js"></script>
    <script src="/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="margin: 50px;border: 1px solid green;">
    <h3>Spring Security Login Example</h3>
    <c:if test="${param.error ne null}">
        <div style="color: red">Invalid credentials.</div>
    </c:if>
    <form action="/login" method="post">
        <div class="form-group">
            <label for="username">UserName:</label> <input type="text"
                                                           class="form-control" id="username" name="username">
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label> <input type="password"
                                                      class="form-control" id="pwd" name="password">
        </div>

        <button type="submit" class="btn btn-success">Submit</button>

        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </form>
</div>
</body>
</html>