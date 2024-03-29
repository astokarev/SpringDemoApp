<!DOCTYPE html>
<html>
<head>
    <title>NEAVITO</title>
</head>
<body>
<h1>NEAVITO</h1><hr>
<h4>Авторизация</h4>
<form action="/login" method="post">
    Эл. почта: <input type="email" name="email"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Вход"/>
</form>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>
<a href="/registration">Зарегистрироваться</a>
</body>
</html>