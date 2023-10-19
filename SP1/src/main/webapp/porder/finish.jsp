<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="vo.member,vo.porder"%>
<%
member m = (member) session.getAttribute("M");
porder p = (porder) session.getAttribute("P");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<SCRIPT LANGUAGE="JavaScript">

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function varitext(text){
text=document
print(text)
}
//  End -->
</script>

</head>
<body>
	<table width=600 align=center border=1>
		<tr height=100>
			<%@include file="../title.jsp"%>

		</tr>
		<tr height=450>
			<td>
				<table wigth=500 align=center border=1>
					<tr align=center>
						<td colspan=2>
							<h2>訂購萬成,這是您的訂單資料</h2>
						</td>
					</tr>
					<tr align=center>
						<td width=100>姓名</td>
						<td><%=m.getName()%></td>
					</tr>
					<tr align=center>
						<td width=100>地址</td>
						<td><%=m.getAddress()%></td>
					</tr>
					<tr align=center>
						<td width=100>A數量</td>
						<td><%=p.getA()%></td>
					</tr>
					<tr align=center>
						<td width=100>B數量</td>
						<td><%=p.getB()%></td>
					</tr>
					<tr align=center>
						<td width=100>C數量</td>
						<td><%=p.getC()%></td>
					</tr>
					<tr>
						<td width=100>共</td>
						<td><%=p.getSum() %>元</td>
					</tr>
					<tr align=center>
						<td colspan=2><a href="porder.jsp">回訂單管理業</a></td>
						<DIV ALIGN="CENTER">
							<FORM>
								<INPUT NAME="print" TYPE="button" VALUE="列印此頁"
									ONCLICK="varitext()">
							</FORM>
						</DIV>
					</tr>
				</table>
		<tr height=50></tr>
	</table>
</body>
</html>