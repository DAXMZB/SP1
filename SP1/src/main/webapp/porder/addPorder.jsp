<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<td>
				<form action="confirm.jsp" method="post">
					<table width=500 align=center border=0>
						<tr align=center>
							<td colspan=3><h3>購物</h3></td>

						</tr>
						<tr>
							<td colspan=3 align=center><hr></td>
						</tr>
						<tr>
							<td align=center valign=top>產品A<br> <img
								src="pic/1.jpeg"></td>

							<td align=center valign=top>產品B<br> <img
								src="pic/2.jpeg"></td>

							<td align=center valign=top>產品C<br> <img
								src="pic/3.jpeg"></td>

						</tr>
						<tr>
							<td align=center><select name="A">
									<option value="0">0</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>

							</select></td>
							<td align=center><select name="B">
									<option value="0">0</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>

							</select></td>
							<td align=center><select name="C">
									<option value="0">0</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>

							</select></td>
						</tr>
						<tr>
							<td align=center colspan=3><hr></td>
						</tr>
						<tr>
							<td align=center colspan=3><input type="submit" value="ok"></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>