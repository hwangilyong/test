<%--
  Created by IntelliJ IDEA.
  User: rhanf
  Date: 2020-07-14
  Time: 오전 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>#</title>
    <link rel="stylesheet" href="../css/reset.css">
</head>
<body>
<div id="wrap">
    <form action="#">
        <fieldset class="join">
            <h1>회원가입</h1>
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" placeholder="6자 이상의 영문 혹은 영문과 숫자를조합"></td>
                    <td><button type="submit">중복확인</button></td>
                </tr>

                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" placeholder="비밀번호를 입력해주세요"></td>
                </tr>

                <tr>
                    <td>비밀번호확인</td>
                    <td><input type="password" placeholder="비밀번호를 한번더 입력해주세요"></td>
                </tr>

                <tr>
                    <td>이름 </td>
                    <td><input type="text" placeholder="이름을 입력해주세요"></td>
                </tr>

                <tr>
                    <td>이메일</td>
                    <td><input type="email" placeholder="예 : aaaaaaa@naver.com"></td>
                    <td><button type="submit">중복확인</button></td>
                </tr>

                <tr>
                    <td>휴대폰</td>
                    <td><input type="text" placeholder="숫자만 입력해주세요"></td>
                    <td><button type="submit">인증번호 받기</button></td>
                </tr>

                <tr>
                    <td>주소</td>
                    <td><button><img src="#" alt="#">주소검색</button></td>
                </tr>

                <tr>
                    <td>성별</td>
                    <td><input type="checkbox" name="남자" id="male">남자</td>
                    <td><input type="checkbox" name="여자" id="female">여자</td>
                    <td><input type="checkbox" name="선택안함" id="none">선택안함</td>
                </tr>

                <tr>
                    <td>생년월일</td>
                    <td><input type="text" placeholder=" YYYY / MM / DD "></td>
                </tr>

            </table>
        </fieldset>
    </form>
</div>
</body>
</html>