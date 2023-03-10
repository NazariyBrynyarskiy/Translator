<%--
  Created by IntelliJ IDEA.
  User: nazariybrynyarsky
  Date: 21.02.2023
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Translator</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    </head>

    <body>
        <div class="container">
            <header>
                <h1>Translator</h1>
            </header>

            <main>
                <form>
                    <h2><textarea type="text" id="inputField" name="inputField"></textarea></h2>
                    <button type="submit">translate</button>
                </form>
                <p>
                    <%@ page import="logic.Processor" %>
                    <%  Processor processor = new Processor();
                        String word = request.getParameter("inputField");
                        if (word == null) {
                            word = "";
                        }
                        word = word.toLowerCase();
                    %>
                    <h2>The translation for "<%= word%>": </h2>
                    <h2><%= processor.getTranslation(word) %></h2>
                </p>
            </main>

            <footer>
                <p>Servlet translator</p>
            </footer>
        </div>
    </body>
</html>
