<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
createPage 입니다

<form action="student/create">
	<input type="text" name="name" value="${student.name}">
	<input type="text" name="id" value="${student.id}">
	<input type="submit" value="전송">
</form>

</body>
</html>