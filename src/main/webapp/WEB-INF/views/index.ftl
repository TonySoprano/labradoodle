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
</head>
<body>
<div id="dishesTypes">Доступные блюда</div>
<div id="listDishesTypes">
    <select>
        <option>тип 1</option>
        <option>тип 2</option>
        <option>тип 2</option>
    </select>
</div>
<table class="tableDishesTypes">
    <tr>
        <td>
            <div class="circle"></div>
        </td>
        <td>
            <div class="circle"></div>
        </td>
        <td>
            <div class="circle"></div>
        </td>
    </tr>
</table>
</body>
</html>