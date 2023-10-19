<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="vo.porder,
    dao.impl.porderDaoImpl,
    java.util.List"%>
    <%
    List<porder>l=new porderDaoImpl().queryAll();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../deleteController" method="post">
				<table width=500 align=center border=1>
					<tr align=center>
						<td align=center><h3>輸入刪除ID</h3>
					<tr align=center>
						<td>
						ID<input type="text" name="ID" size=3>
						<input type="submit" value="ok">
				
				
				</table>		
			
			</form>	
			
			
			
			<hr>
			<table width=500 align=center border=1>
					
					<tr align=center>
					<td>ID<td>會員編號<td>A<td>B<td>C<td>金額
					<%
					for(porder p:l)
					{
						
						out.println("<tr><td>"+p.getId()+
								"<td>"+p.getMemberNo()+
								"<td>"+p.getA()+
								"<td>"+p.getB()+
								"<td>"+p.getC()+
								"<td>"+p.getSum());					
						
					}		
					
					
					%>
					<tr>
						<td colspan=6 align=center>
						<a href="porder.jsp">回上一頁</a>
				
				</table>		
</body>
</html>