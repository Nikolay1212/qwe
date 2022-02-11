<!doctype html>
<html lang="ru">
<#import "spring.ftl" as spring/>
<head>
    <title>Регистрация</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<@spring.bind "signUpForm"/>
<form action="/signUp" method="post">
    <label for="login">Enter login:
        <input id="login" name="login" placeholder="Login">
    </label>
    <label for="password">Enter password:
        <input id="password" name="password" placeholder="password">
    </label>
    <input type="submit" value="Регистрация">
</form>
</body>
</html>
