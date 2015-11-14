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
            <option>Please, select your region</option>
            <option>Киевская область</option>
            <option>Донецкая область</option>
            <option>Днепропетровская область</option>
            <option>Одесская область</option>
        </select>
        <select class="form-control" id="city-select">
            <option>Киев</option>
            <option>Днепропетровск</option>
            <option>Одесса</option>
            <option>Донецк</option>
        </select>
        <select class="form-control" disabled="disabled" id="street-select">
            <option>Бажана</option>
            <option>Институтская</option>
            <option>Херутская</option>
            <option>Проститутская</option>
        </select>
    </div>
</form>


<div id="dishesTypes">
    <div id="forDishes">
        <div id="pizza" class="blackRectangle">
            <div class="info"></div>
            <div class="infoText">PIZZA</div>
        </div>
        <div id="chine" class="blackRectangle">
            <div class="info"></div>
            <div class="infoText">CHINE</div>
        </div>
        <div id="fish" class="blackRectangle">
            <div class="info"></div>
            <div class="infoText">FISH</div>
        </div>
        <div id="burgers" class="blackRectangle">
            <div class="info"></div>
            <div class="infoText">BURGERS</div>
        </div>
        <div id="sushi" class="blackRectangle">
            <div class="info"></div>
            <div class="infoText">SUSHI</div>
        </div>


    </div>




    <#--<div id="circleDishesTypes">-->
        <#--<div id="dishesTypes-preloader">-->
            <#--<i class="fa fa-circle-o-notch fa-pulse fa-4x"></i>-->
        <#--</div>-->
    <#--</div>-->
</div>
<div id="HotDeals">
    <h1 class="infoText2">Hot Deals</h1>
</div>
<div id="HotDishes">
    <div id="HotDishesInside">
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>
        <div class="dishes">
            <div class="dishesinfo">
                <div class="dishesinfotext">Caesar salad</div>
            </div>
        </div>

    </div>
</div>


</body>
</html>