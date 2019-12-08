<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" href="css/css.css">
</head>
<body>
		<table>
			<c:forEach items="${list.list }" var="g">
				<tr>
					<td>${g.gid }</td>
					<td>${g.gname }</td>
					<td>${g.gender }</td>
					<td>${g.city }</td>
					<td>${g.company }</td>
					<td>${g.major1 }</td>
					<td>${g.major2 }</td>
					<td>${g.major3 }</td>
					<td>${g.register }</td>
					<td>${g.perform }</td>
					<td>
						<fmt:formatDate value="${g.dt }" pattern="yyyy-MM-dd"/>
					</td>
					
				</tr>
			</c:forEach>
		</table>
</body>
</html>