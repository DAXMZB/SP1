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
			<td align=center><%@include file="title.jsp"%>
		<tr height=450>
			<td>
				<form action="addMemberController" method="post">
					<table height=400 align=center border=3>
						<tr>
							<td colspan=2 align=center>
								<h3>新增會員資料</h3>
						<tr align=center>
							<td>會員編號
							<td><input type="text" name="memberNo">
						<tr align=center>
							<td>帳號
							<td><input type="text" name="username">
						<tr align=center>
							<td>密碼
							<td><input type="password" name="password">
						<tr align=center>
							<td>姓名
							<td><input type="text" name="name">
						<tr align=center>
							<td>地址
							<td><input type="text" name="address">
						<tr align=center>
							<td>電話
							<td><input type="text" name="phone">
						<tr align=center>
							<td>行動
							<td><input type="text" name="mobile">
						<tr>
							<td colspan=2 align=center><input type="submit" value="ok">
					</table>
				</form>
	
	</table>
</body>
</html>