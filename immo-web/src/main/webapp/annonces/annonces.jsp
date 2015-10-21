<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Immo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h3>OK 1</h3>
<c:set var="annonces" scope="request" value="${annonces}"/>
<c:forEach var="annonce" items="${annonces}">
    <h3>${annonce.annonceId} ${annonce.titre} ${annonce.dateCreationAnnonce} </h3>
</c:forEach>

</body>
</html>