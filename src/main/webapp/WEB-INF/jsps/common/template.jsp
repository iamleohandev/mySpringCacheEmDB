<%@include file="include.jsp"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/main.css' />">

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/expand.css' />">

<script type="text/javascript"
	src="<c:url value='/resources/js/jquery.js' />"></script>


<title><c:set var="titleKey">
		<tiles:insertAttribute name="title" ignore="true" />
	</c:set> <spring:message code="${titleKey}" /></title>
</head>
<body>
	<div class="page">
		<tiles:insertAttribute name="header" />
		<div class="content">
			<tiles:insertAttribute name="menu" />
			<tiles:insertAttribute name="body" />
		</div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>