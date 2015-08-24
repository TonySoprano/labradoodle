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

<div id="circleDishesTypes">
    <div class="circle" style="background: url(https://pp.vk.me/c622317/v622317838/19844/MfHSmGUIN7I.jpg) center no-repeat; background-size: 150%;"></div>
    <div class="circle" style="background: url(http://zdorov.guru/img/catalog/zdorov/282/original.jpg) center no-repeat; background-size: 150%;"></div>
    <div class="circle" style="background: url(http://xvatit.com/uploads/posts/2015-01/1421935996_pizza-mushroom-01.jpg) center no-repeat; background-size: 150%;"></div>
</div>
<div id="blocks" >
    <div class="block1">
        <a href=" " >
            <img src="https://tpc.googlesyndication.com/simgad/10150932345484726920" border="0" width="460" height="230" alt="" class="img_ad">
        </a>
    </div>
    <div class="block2">
        <a href=" ">
            <img src="https://tpc.googlesyndication.com/simgad/14368965802840480494" border="0" width="460" height="230" alt="" class="img_ad">
        </a>
    </div>
    <div class="block3">
        <a href=" " >
            <img src="https://tpc.googlesyndication.com/simgad/2125599233914660053" border="0" width="460" height="230" alt="" class="img_ad">
        </a>
    </div>
    <div class="block4">
        <a href=" " >
            <img src="https://tpc.googlesyndication.com/simgad/6661425047524397169" border="0" width="460" height="230" alt="" class="img_ad">
        </a>
    </div>
</div>
</body>
</html>