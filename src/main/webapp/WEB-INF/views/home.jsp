<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>#</title>
	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	<link rel="stylesheet" href="../css/reset.css">
</head>
<body>
<div id="wrap">
	<form action="#">
		<fieldset class="login">
			<h1>로그인</h1>
			<table>
				<tr>
					<td><input type="text" placeholder="아이디를 입력해주세요 "></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="비밀번호를 입력해주세요"></td>
				</tr>
				<tr>
					<td><a href="#">아이디 찾기</a></td>
					<td><a href="#">비밀번호 찾기</a></td>
				</tr>
				<tr>
					<td><button type="submit">로그인</button></td>
				</tr>
				<tr>
					<td><button type="submit">회원가입</button></td>
				</tr>
			</table>
		</fieldset>
	</form>
</div>
</body>
</html>