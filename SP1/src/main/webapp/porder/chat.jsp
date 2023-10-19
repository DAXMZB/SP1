<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="vo.chat,
	dao.impl.chatDaoImpl,
	java.util.List"%>
<%
List<chat> l = new chatDaoImpl().queryAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=500 align=center border=1>
		<tr>
			<td colspan=2><a href="addChat.jsp" style="color:white">我要留言</a>
			 </td>
		</tr>
		<%
		for (chat c : l) {
			out.println("<tr><td><font color=white >第"+c.getId()+"篇"+"<td><font color=white>ID："+c.getName()+
					"<tr><td><font color=white>主題<td><font color=white>"+c.getSubject()+
					"<tr><td colspan=2><font color=white>內容"+
					"<tr><td colspan=2><textarea row=5 cols=50 name=content>"+c.getContent()+"</textarea><tr><td colspan=2><hr>");
		}
		%>
	</table>
</body>
</html>