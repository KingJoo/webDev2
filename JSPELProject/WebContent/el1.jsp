<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class=container>
		<h1>지니뮤직</h1>
		<div class=row>
			<table class=table>
				<tr class=danger>
					<th class=text-center>순위</th>
					<th class=text-center>등폭</th>
					<th class=text-center></th>
					<th class=text-center>곡명</th>
					<th class=text-center>가수명</th>
				</tr>
				<c:forEach var="vo" items="${list}">
					<td class=text-center>${vo.no}</td>
					<td class=text-center>${vo.no}</td>
					<td class=text-center>${vo.no}</td>
					<td class=text-center>${vo.no}</td>
					<td class=text-center>${vo.no}</td>
				</c:forEach>
			</table>	
		</div>
	</div>
</body>
</html>