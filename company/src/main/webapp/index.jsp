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
<body bgcolor="9DBEC4" background="Photo/dark-sky.jpeg">

	<a href="ex2.html" target="_blank"></a>
	<table width="100%" border="2" align="center" height="300">
		<tr bgcolor="black" style="opacity: 0.5;">
			<td align="center"><font color="white" size="7"><b><h1>

							TL</h1></b></font></td>
		</tr>
	</table>
	<table width="100%" border="2" align="center" style="opacity: 0.5;">
		<tr height="60">
			<th align="center" width="400"></th>
			<th align="center" bgcolor="9DBEC4"><a href="index.jsp"><font
					color="black">Home</font></a></th>
			<th align="center" bgcolor="9DBEC4">About</th>
			<th align="center" bgcolor="9DBEC4">My blog</th>
			<th align="center" bgcolor="9DBEC4">Contact</th>
			<th align="center" bgcolor="9DBEC4">Search...</th>
			<td align="center" width="400"></td>

		</tr>
	</table>
	<table width="100%" border="2">

		<tr align="center">
			<form action="LoginController" method="post">

				<td width="400"><font color="white">會員登入</font><br> <input
					type="text" name="username" placeholder="8位數英數帳號"><br>
					<input type="password" name="password" placeholder="8位數英數密碼"><br>
					<input type="submit" value="登入"></td>
				</td>
			</form>
			<td style="overflow: auto; max-height: 500px;" align="center"
				colspan="5" rowspan="6" id="output">
				<div style="height: 500px;">
					<p id=output2>
						aaaaaaaaaa
					</p>
				</div>
			</td>


			<td rowspan="3" width="400"><font color="white" height="300">BMI計算</font><br>
				<form action="BMI" method="post" onsubmit="disableSubmitButton()" >

					<br> <font color="white">身高：</font><input type="text"
						name="height">cm<br> <font color="white">體重：</font><input
						type="text" name="weight">kg<br> <br> <input
						type="submit" value="送出"> <input type="reset" value="重設"><br>
					<br> <font color=white align="center">您的BMI為：${bmi }</font></td>
			</form>
		</tr>

		<form method="post">
			<tr align="center">
				<td height="30"><font color="white">會員管理</font></td>
			</tr>
			<tr align="center">
				<td height="30"><a href="add.html" onclick="loadAddHtml()"><font
						color="red">新增</font></a></td>
			</tr>

			<script>
				function loadAddHtml() {
					// 使用 AJAX 加載add.html檔案的內容
					$.ajax({
						url : "add.html",//add.html檔案的路徑
						dataType : "html",
						success : function(data) {
							$("#output2").html(data);// 在<td>中顯示add.html內容
						}
					});
					event.preventDefault(); // 防止超連結的預設行為（跳轉）
				}
			</script>

			<tr align="center">
				<td height="30"><a href="StringQuery.java"
					onclick="loadQueryHtml()"><font color="red">查詢</font></a></td>
			</tr>
			<script>
				function loadQueryHtml() {
					// 使用 AJAX 加載queryController.java檔案的內容
					$.ajax({
						url : "queryController",//queryController.java檔案的路徑
						dataType : "text",
						success : function(data) {
							$("#output2").html(data);// 在<td>中顯示queryController內容
						}
					});
					event.preventDefault(); // 防止超連結的預設行為（跳轉）
				}
			</script>

			<tr align="center">
				<td height="30"><a href="update.html"
					onclick="loadUpdateHtml()"><font color="red">修改</font></a></td>
			</tr>
			<script>
				function loadUpdateHtml() {
					// 使用 AJAX 加載add.html檔案的內容
					$.ajax({
						url : "update.html",//add.html檔案的路徑
						dataType : "html",
						success : function(data) {
							$("#output2").html(data);// 在<td>中顯示add.html內容
						}
					});
					event.preventDefault(); // 防止超連結的預設行為（跳轉）
				}
			</script>

			<tr align="center">
				<td height="30"><a href="delete.html"
					onclick="loadDeleteHtml()"><font color="red">刪除</font></a></td>
				<td><font color="green"><%=new Date()%></font></td>
			</tr>
			<script>
				function loadDeleteHtml() {
					// 使用 AJAX 加載add.html檔案的內容
					$.ajax({
						url : "delete.html",//add.html檔案的路徑
						dataType : "html",
						success : function(data) {
							$("#output2").html(data);// 在<td>中顯示add.html內容
						}
					});
					event.preventDefault(); // 防止超連結的預設行為（跳轉）
				}
			</script>

		</form>

	</table>

</body>
</html>