<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>

<link href='<c:url value="/resources/bootstrap-4.0.0/css/bootstrap.min.css" />' rel="stylesheet">
<script src='<c:url value="/resources/js/jquery-3.2.1.min.js" />' ></script>
<script src='<c:url value="/resources/bootstrap-4.0.0/js/bootstrap.min.js" />' ></script>

</head>
<body>
	<tiles:insertAttribute name="header" />
	<div id="container">
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>