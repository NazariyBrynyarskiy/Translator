<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    </head>
    <body>
        <div class="container">
            <header>
                <h1><%= "Hello Servlet!" %></h1>
            </header>

            <main>
                <h2><a href="/translator">Move to Translator</a></h2>
            </main>

            <footer>
                <p>Servlet translator</p>
            </footer>
        </div>
    </body>
</html>