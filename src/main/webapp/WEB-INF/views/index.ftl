<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Успей поесть!</title>
    <link href="/css/spinners.css" media="screen" rel="stylesheet">
    <link href="/css/bootstrap.min.css" media="screen" rel="stylesheet">
    <link href="/css/bootstrap-theme.min.css" media="screen" rel="stylesheet">
    <link href="/css/index.css" media="screen" rel="stylesheet">
    <script type="text/javascript" src="/js/lib/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="/js/lib/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/lib/jquery.countdown.min.js"></script>
    <script type="text/javascript" src="/js/index_functions.js"></script>
    <script type="text/javascript" src="/js/index_onstart.js"></script>
    <script type="text/javascript" src="/js/index_addevents.js"></script>
    <script type="text/javascript" src="/js/basket.js"></script>
    <script type="text/javascript">
        var $applicationRoot = '/';
        var $host = document.location.protocol + '//' + document.location.host;
        var $hostRoot = document.location.protocol + '//' + document.location.host + $applicationRoot;
    </script>
</head>
<body>
<!-- Location -->
<div class="form-inline" align="center">
    <div class="head">
        <a href="/">
            <svg class="logo"></svg>
        </a>
        <label for="sel1"></label>
        <select class="form-control" id="region-select">
            <option disabled selected>Выберите область</option>
        </select>
        <select class="form-control" id="city-select">
            <option disabled selected>Выберите город</option>
        </select>
        <select class="form-control" id="street-select">
            <option disabled selected>Выберите улицу</option>
        </select>
        <a href="#">
            <img class="basket" src="../img/basket.svg"></img>
            <div class="basketCount">0</div>
        </a>

    </div>
</div>

<div id="dishesTypes" align="center">
        <div class="dishesTypesImage" id="image_1"></div>
        <div class="dishesTypesImage" id="image_2"></div>
        <div class="dishesTypesImage" id="image_3"></div>
        <div class="dishesTypesImage" id="image_4"></div>
    <div id="forDishes">
        <i id="dishesTypes-preloader" class="whirly-loader"></i>
    </div>
</div>

<div id="HotDeals">
    <h1 class="infoText2">HOT DEALS</h1>
</div>
<div id="HotDishes">
    <div id="HotDishesInside">
        <div id="hotDishes-preloader">
            <i class="whirly-loader"></i>
        </div>
    </div>
</div>
<div id="vault">
    <div id="cabinet">
        <div id="enterCabinet">Sign in</div>
        <div id="registration" title="For new restaurant">Register</div>
        <span id="copyright">Copyright, 2015.</span>
    </div>
</div>
<div id="cabinetForm">
    <div id="cabinetFormInfo">
        <form class="cabinetFormText" action="" method="post">
            <p><strong>Логин: </strong>
                <br>
                <input maxlength="25" size="40" name="Login/E-mail"></p>

            <p><strong>Пароль:</strong>
                <br>
                <input type="password" maxlength="25" size="40" name="Password"></p>
            <input type="submit" value="Подтвердить">
        </form>
    </div>
</div>
</body>
</html>
<#--<div class="addBasket" title="В корзину">-->
    <#--<div class="addBasketPlus"></div>-->
<#--</div>-->

<#--$('.addBasket').hide();-->