<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="vo.member"%>
<%
member m = (member) session.getAttribute("M");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../addChatController" method="post">
		<table width=400 align=center border=1>
			<tr>
				<td>留言者</td>
				<td><%=m.getName()%></td>
			</tr>
			<tr>
				<td>主題</td>
				<td><input type="text" name="subject"></td>
			</tr>
			<tr>
				<td colsapn=2>內容</td>
			</tr>
			<tr>
				<td colsapn=2><textarea rows="5" cols="50" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" value="送出"></td>
			</tr>
		</table>
	</form>
</body>
</html>