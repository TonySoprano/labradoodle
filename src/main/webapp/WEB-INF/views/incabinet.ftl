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
    <script type="text/javascript" src="/js/cabinet.js"></script>
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
        <a name="top"></a>
        <a href="/">
            <svg class="logo"></svg>
        </a>
        <label for="sel1"></label>
    </div>
</div>

<div id="HotDeals">
    <h1 class="infoText2">SIGN IN</h1>
</div>
<div id="HotDishes">
    <div id="HotDishesInside">

    </div>
</div>
<div id="vault">
    <div id="cabinet">
        <a href="#top">
            <div id="enterCabinet">Sign in</div>
        </a>
        <div id="registration" title="For new restaurant">Register</div>
        <span id="copyright">Copyright, 2015.</span>
    </div>
</div>

</body>
</html>