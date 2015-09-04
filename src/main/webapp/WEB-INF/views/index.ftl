<#assign c=JspTaglibs["http://java.sun.com/jsp/jstl/core"]>
<#assign s=JspTaglibs["http://www.springframework.org/tags"]>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Успей поесть!</title>
    <link href="<@c.url value="/resources/css/index.css" />" rel="stylesheet" media="screen"/>
    <link href="<@c.url value="/resources/css/bootstrap.css" />" rel="stylesheet" media="screen"/>
    <link href="<@c.url value="/resources/css/bootstrap-theme.css" />" rel="stylesheet" media="screen"/>
    <link href="<@c.url value="/resources/css/font-awesome.css" />" rel="stylesheet" media="screen"/>
    <script type="text/javascript" src="<@c.url value="/resources/js/jquery-2.1.4.js"/>"></script>
    <script type="text/javascript" src="<@c.url value="/resources/js/bootstrap.js"/>"></script>
    <script type="text/javascript" src="<@c.url value="/resources/js/index.js"/>"></script>
    <script type="text/javascript">
        var $applicationRoot = "<@s.url value="/" />";
        var $host = document.location.protocol + '//' + document.location.host;
        var $hostRoot = document.location.protocol + '//' + document.location.host + $applicationRoot;
    </script>
</head>
<body>
<div id="dishesTypes">Доступные блюда</div>

<div id="circleDishesTypes">
    <div id="dishesTypes-preloader">
        <i class="fa fa-circle-o-notch fa-pulse fa-4x"></i>
    </div>
</div>


</body>
</html>