<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="styles.css">
</head>
<body bgcolor="9DBEC4" background="pic/dark-sky.jpeg">
	<a href="ex2.html" target="_blank"></a>
	<table width="100%" border="2" align="center" height="300">
		<tr bgcolor="black" style="opacity: 0.5;">
			<%@include file="../title.jsp"%>
		</tr>
	</table>
	<table width="100%" border="2" align="center" style="opacity: 0.5;">
		<tr height="60">
			<th align="center" width="400"></th>
			<th align="center" bgcolor="9DBEC4"><a href="loginSuccess.jsp"><font
					color="black">Home</font></a></th>
			<th align="center" bgcolor="9DBEC4"><a href="About.jsp"
				onclick="loadAboutHtml()"><font color="black">About</font></a></th>
			<th align="center" bgcolor="9DBEC4">My blog</th>
			<th align="center" bgcolor="9DBEC4">Contact</th>
			<th align="center" bgcolor="9DBEC4">Search...</th>
			<td align="center" width="400"></td>

		</tr>
		<script>
			function loadAboutHtml() {
				// 使用 AJAX 加載about.html檔案的內容
				$.ajax({
					url : "About.jsp",
					dataType : "html",
					success : function(data) {
						$("#output").html(data);// 在<td>中顯示add.html內容
					}
				});
				event.preventDefault();// 防止超連結的預設行為（跳轉）
			}
		</script>

	</table>

	<table width="100%" border="2">

		<tr align="center">


			<td width="400">
				<table width=350 algin=center border=0 style="opacity: 0.5;">
					<a href="porder.jsp" style="color: white">進入購物</a>
					<a href="../LogoutController" style="color: white">登出</a>
				</table>

			</td>


			<td height=500 style="overflow: auto; max-height: 800px;"
				align="center" colspan="5" rowspan="6" id="output">
				<div style="height: 500px;">
					<%@include file="chat.jsp"%>
				</div>
			</td>


			<%@include file="BMI.jsp"%>
		</tr>





	</table>
</body>
</html>