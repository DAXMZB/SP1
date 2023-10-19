<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="vo.porder,
	dao.impl.porderDaoImpl,
	java.util.List"%>

<%
List<porder> l = new porderDaoImpl().queryAll();
%>
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
			<td><table width=500 align=center border=1>
					<tr align=center>
						<td colspan=6><h3>所有訂單</h3></td>
					</tr>
					<tr align=center>
						<td>ID
						<td>會員編號
						<td>A
						<td>B
						<td>C
						<td>金額 <%
						for (porder p : l) {
							out.println("<tr><td align=center>" + p.getId() + 
									"<td align=center>" + p.getMemberNo() + 
									"<td align=center>" + p.getA() + 
									"<td align=center>" + p.getB() + 
									"<td align=center>" + p.getC() + 
									"<td align=center>" + p.getSum());
						}
						%>
					<tr>
						<td colsapn=6 align=center><a href="query.jsp">回上一頁</a></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>