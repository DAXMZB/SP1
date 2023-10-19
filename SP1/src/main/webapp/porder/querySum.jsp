<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="vo.porder,
	java.util.List,
	dao.impl.porderDaoImpl"%>
<%
String Start = request.getParameter("start");
String End = request.getParameter("end");
List<porder> l = null;
if (Start != "" && Start != null && End != "" && End != null) {
	int s = Integer.parseInt(Start);
	int e = Integer.parseInt(End);
	l = new porderDaoImpl().querySum(s, e);
} else {
	l = new porderDaoImpl().queryAll();
}
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
			<%@include file="../title.jsp"%></td>
		</tr>
		<tr height=450>
			<td>
				<form action="querySum.jsp" method="post">
					<table width=500 align=center border=1>
						<tr align=center>
							<td aling=center><h3>輸入查詢金額條件</h3></td>
						</tr>
						<tr align=center>
							<td>搜尋金額從<input type="text" name="start" size=5>到 <input
								type="text" name="end" size=5> <input type="submit"
								value="ok"></td>
						</tr>
					</table>
				</form>
				<hr>
				<table width=500 align=center border=1>

					<tr align=center>
						<td>ID 
						<td>會員編號
						<td>A
						<td>B
						<td>C
						<td>金額 <%
						for (porder p : l) {

							out.println("<tr><td>" + p.getId() + "<td>" + p.getMemberNo() + "<td>" + p.getA() + "<td>" + p.getB() + "<td>"
							+ p.getC() + "<td>" + p.getSum());

						}
						%>
					<tr>
						<td colspan=6 align=center><a href="query.jsp">回上一頁</a>
				</table>


			</td>
		</tr>
	</table>


</body>
</html>