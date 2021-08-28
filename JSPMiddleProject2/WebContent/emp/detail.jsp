<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.sist.dao.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String empno=request.getParameter("empno");
	EmpDAO dao=new EmpDAO();
	EmpVO vo=dao.empDetailData(Integer.parseInt(empno));
%>
<c:set var="vo" value=<%=vo %>/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>