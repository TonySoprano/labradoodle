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
        <i id="dishesTypes-preloader" class="fa fa-spinner fa-pulse fa-4x"></i>
        <div class="blackRectangle">
            <div id="pizza"></div>
            <div class="infoText">PIZZA</div>
        </div>
        <div class="blackRectangle">
            <div id="chine"></div>
            <div class="infoText">CHINE</div>
        </div>
        <div class="blackRectangle">
            <div id="fish"></div>
            <div class="infoText">FISH</div>
        </div>
        <div class="blackRectangle">
            <div id="burgers"></div>
            <div class="infoText">BURGERS</div>
        </div>
        <div class="blackRectangle">
            <div id="sushi"></div>
            <div class="infoText">SUSHI</div>
        </div>


    </div>
</div>
<div id="HotDeals">
    <h1 class="infoText2">Hot Deals</h1>
</div>
<div id="HotDishes">
    <div id="HotDishesInside">
        <div id="hotDishes-preloader">
            <i class="fa fa-spinner fa-pulse fa-4x"></i>
        </div>
        <div class="dishes">
            <div class="deadline">1:40</div>
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
                <div class="dishesinfoOLDPrice">120</div>
                <div class="dishesinfoNEWPrice">109</div>
            </div>
        </div>
        <div class="dishes">
            <div class="deadline">1:40</div>
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
                <div class="dishesinfoOLDPrice">120</div>
                <div class="dishesinfoNEWPrice">109</div>
            </div>
        </div>
        <div class="dishes">
            <div class="deadline">1:40</div>
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
                <div class="dishesinfoOLDPrice">120</div>
                <div class="dishesinfoNEWPrice">109</div>
            </div>
        </div>
        <div class="dishes">
            <div class="deadline">1:40</div>
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
                <div class="dishesinfoOLDPrice">120</div>
                <div class="dishesinfoNEWPrice">109</div>
            </div>
        </div>


        <a href="#openModal">Открыть описание блюда</a>
        <div id="openModal" class="modalDialog">
            <div>
                <div class="modalImage"></div>
                <div class="modalInfoHeader">Caesar salad</div>
                <div class="modaldeadline">1:40</div>
                <div class="modalInfo">
                    <p class="modalInfoText">Caesar salad. The salad's creation is generally attributed to restaurateur Caesar Cardini,
                        an Italian immigrant who operated restaurants in Mexico and the United States. Cardini was living
                        in San Diego but also working in Tijuana where he avoided the restrictions of Prohibition.
                        </p>
                </div>
                <div class="modalOLDPrice">120</div>
                <div class="modalNEWPrice">109</div>
                <a href="#close" title="Закрыть" class="close">X</a>
        </div>








    </div>
</body>
</html>