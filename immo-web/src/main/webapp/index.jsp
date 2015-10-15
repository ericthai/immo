<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Projet Immo</h2>
<%
String prenom="Eric";
%>
<h3>customisation via le fichier application.properties (attention aux excludes avec maven lors d un eclipse:eclipse)</h3>
<h3>http://localhost:8080/immo-web/annonces?clientId=eric</h3>
<h3>http://localhost:8080/immo-web/index.jsp</h3>
<h3><%=prenom %></h3>
<br/>
<c:set var="myvariableJSTL" value="Mon Prenom" scope="request"></c:set>
<h3>En JSTL (C:OUT) : <c:out value="${myvariableJSTL}" /></h3>
</body>
</html>
