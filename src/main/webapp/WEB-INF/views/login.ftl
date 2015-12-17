<!DOCTYPE html>
<html lang="ru">
<head>
</head>
<body>
<#--
    <div>
        <#if param.error>
            Worng email or pass
        </#if>
    </div>
    <div>
        <#if param.logout>
            you have been logged out
        </#if>
    </div>
-->
    <form class="login-form" action="/login" method="post">
        <label for="j_username">Username</label>
        <input id="j_username" name="username" type="text"  placeholder="Введите ваш акаунт"><br>

        <label for="j_password">Password</label>
        <input id="j_password" name="password" type="password"  placeholder="Введите пароль"><br>

        <input type="submit" name="submit" value="Войти">
    </form>

</body>
</html>