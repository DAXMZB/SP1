<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=100>
			<%@include file="../title.jsp"%>
		</tr>
		<tr height=450>
			<td align=center>
				<table width=400 align=center border=0>
					<tr>
						<td><a href="addPorder.jsp">新增</a></td>
					</tr>
					<tr>
						<td><a href="query.jsp">查詢</a></td>
					</tr>
					<tr>
						<td><a href="update.jsp">修改</a></td>
					</tr>
					<tr>
						<td><a href="delete.jsp">刪除</a></td>
					</tr>
					
				</table>
			</td>
		</tr>
	</table>
</body>
</html>