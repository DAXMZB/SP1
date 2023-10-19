<%@ 
page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 在<head>中添加样式和脚本文件的引用 -->
<link rel="stylesheet" href="styles.css">

</head>
<body bgcolor="9DBEC4" background="porder/pic/dark-sky.jpeg">

	<a href="ex2.html" target="_blank"></a>
	<table width="100%" border="2" align="center" height="300">
		<tr bgcolor="black" style="opacity: 0.5;">
			<%@include file="title.jsp"%>
		</tr>
	</table>
	<table width="100%" border="2" align="center" style="opacity: 0.5;">
		<tr height="60">
			<th align="center" width="400"></th>
			<th align="center" bgcolor="9DBEC4"><a href="index.jsp"><font
					color="black">Home</font></a></th>
			<th align="center" bgcolor="9DBEC4"><a href="porder/About.jsp"
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
					url : "porder/About.jsp",
					dataType : "html",
					success : function(data) {
						$("#output").html(data);
					}
				});
				event.preventDefault();// 防止超連結的預設行為（跳轉）
			}
		</script>
	</table>
	<table width="100%" border="2">

		<tr align="center">


			<td width="400"><font color="white"> <!-- 若用<a>需使用Jquery -->
					<a href="login.jsp" style="color: white">登入 </a> <a
					href="addMember.jsp" style="color: white"> 註冊</a></td>
			</td>

			<td style="overflow: auto; max-height: 500px;" align="center"
				colspan="5" rowspan="6" id="output">
				<div style="height: 500px;">
					<%@include file="porder/chat.jsp"%>
				</div>
			</td>


			<td rowspan="3" width="400"><font color="white" height="300">BMI計算</font><br>
				<form action="BMI" method="post" onsubmit="disableSubmitButton()">

					<br> <font color="white">身高：</font><input type="text"
						name="height">cm<br> <font color="white">體重：</font><input
						type="text" name="weight">kg<br> <br> <input
						type="submit" value="送出"> <input type="reset" value="重設"><br>
					<br> <font color=white align="center">您的BMI為：</font></td>
			</form>
		</tr>





	</table>

</body>
</html>