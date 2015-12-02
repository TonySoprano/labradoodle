<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Успей поесть!</title>
    <link href="/css/spinners.css" media="screen" rel="stylesheet">
    <link href="/css/font-awesome.css" media="screen" rel="stylesheet">
    <link href="/css/bootstrap.css" media="screen" rel="stylesheet">
    <link href="/css/bootstrap-theme.css" media="screen" rel="stylesheet">
    <link href="/css/index.css" media="screen" rel="stylesheet">
    <script type="text/javascript" src="/js/lib/jquery-2.1.4.js"></script>
    <script type="text/javascript" src="/js/lib/bootstrap.js"></script>
    <script type="text/javascript" src="/js/index.js"></script>
    <script type="text/javascript">
        var $applicationRoot = '/';
        var $host = document.location.protocol + '//' + document.location.host;
        var $hostRoot = document.location.protocol + '//' + document.location.host + $applicationRoot;
    </script>
</head>
<body>
<!-- Location -->
<form class="form-inline" align="center">
    <div class="head">
        <svg class="logo"></svg>
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
    </div>
</form>


<div id="dishesTypes">
    <div id="forDishes">
        <i id="dishesTypes-preloader" class="whirly-loader"></i>
    </div>
</div>

<#--<div id="Dishes">-->
    <#--<div id="DishesInside">-->
    <#--</div>-->
<#--</div>-->

<div id="HotDeals">
    <h1 class="infoText2">Hot Deals</h1>
</div>
<div id="HotDishes">
    <div id="HotDishesInside">
        <div id="hotDishes-preloader">
            <i class="whirly-loader"></i>
        </div>
    </div>
    </div>
</body>
</html>