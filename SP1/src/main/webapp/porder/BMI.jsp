<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String bmi=(String)session.getAttribute("BMI");
	if(bmi==null)
	{
		bmi="";
	}
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<td rowspan="3" width="400"><font color="white" height="300">BMI計算</font><br>
		<form action="../BMI" method="post" onsubmit="disableSubmitButton()">

			<br> <font color="white">身高：</font><input type="text"
				name="height">cm<br> <font color="white">體重：</font><input
				type="text" name="weight">kg<br> <br> <input
				type="submit" value="送出"> <input type="reset" value="重設"><br>
			<br> <font color=white align="center">您的BMI為：<%=bmi %></font></td>
	</form>
</body>
</html>