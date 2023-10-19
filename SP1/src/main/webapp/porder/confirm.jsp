<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="vo.member,vo.porder"%>
<%
int a = Integer.parseInt(request.getParameter("A"));
int b = Integer.parseInt(request.getParameter("B"));
int c = Integer.parseInt(request.getParameter("C"));

member m = (member) session.getAttribute("M");
porder p = new porder(m.getMemberNo(), a, b, c);
session.setAttribute("P", p);
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
	</table>
	<table width=600 align=center border=1>
		<tr>
			<td colspan=2 align=center>訂購項目</td>
		</tr>
		<tr>
			<td width=100>訂購者姓名</td>
			<td><%=m.getName()%></td>
		</tr>
		<tr>
			<td>A產品數量</td>
			<td><%=p.getA()%></td>
		</tr>
		<tr>
			<td>B產品數量</td>
			<td><%=p.getB()%></td>
		</tr>
		<tr>
			<td>C產品數量</td>
			<td><%=p.getC()%></td>
		</tr>
		<tr>
			<td>一共</td>
			<td><%=p.getSum()%>元</td>
		</tr>
		<tr>
			<td colspan=2 align=center><a href="addPorder.jsp">回上一頁</a> <a
				href="../addPorderController">確定</a></td>
		</tr>
	</table>
</body>
</html>