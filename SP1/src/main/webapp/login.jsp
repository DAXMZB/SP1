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
			<%@include file="title.jsp"%>
		</tr>
		<tr height=400>
			<td>
				<form action="LoginController">
					<table width=400 align=center border=1>
						<tr align=center>
							<td>帳號</td>
							<td><input type="text" name="username" placeholder="8位數英數帳號"></td>
						</tr>
						<tr align=center>
							<td>密碼</td>
							<td><input type="password" name="password" placeholder="8位數英數帳號"></td>
						</tr>
						<tr>
							<td colspan=2 align=center><input type="submit" value="ok"></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>

	</table>
</body>
</html>