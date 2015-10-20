<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Immo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h3>Update d'une Annonce</h3>
<c:set var="annonce" scope="request" value="${annonce}"/>
<h3>annonceId : <c:out value="${annonce.annonceId}"></c:out></h3>
<h3>titre (new) : <c:out value="${annonce.titre}"></c:out></h3>
</body>
</html>