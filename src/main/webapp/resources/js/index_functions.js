/**
 * Created by proton on 17.08.2015.
 */

function hotdishesblock(kladr) {
    var jsonUrl = '';
    if (typeof kladr == 'undefined') {
        jsonUrl = 'get/hotdishes?kladr=';
        console.log(jsonUrl);
    } else {
        jsonUrl = 'get/hotdishes?kladr=' + kladr;
        console.log(jsonUrl);
    }

    $.ajax({
        url: $hostRoot + jsonUrl,
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            //remove hot dishes preloader
            $('#hotDishes-preloader').hide();
            $('#HotDishesInside').html('');

            //add hot dishe
            for (var i = 0; i < data.length; i++) {
                var type = data[i];
                var deadtime = new Date(type.deadline);
                $('#HotDishesInside')
                    .append('<a href="#' + type.dishId + '"><div class="dishes" index="' + type.dishId + '" style="background-image: url(../img/' + type.photo + '); background-size: cover;"><div class="deadline"><span class="clock' + type.dishId + '"></span></div><div class="addBasket" title="В корзину"><div class="addBasketPlus"></div></div><div class="dishesinfo"><div class="dishesinfotext">' + type.name + '</div><div class="dishesinfoOLDPrice">' + type.priceOriginal + '</div><div class="dishesinfoNEWPrice">' + type.priceNew + '</div></div></div></a>')
                    .append('<div id="' + type.dishId + '" class="modalDialog"><div><div class="modalImage" style="background-image: url(../img/' + type.photo + '); background-size: cover;"></div>' +
                    '<div class="modalInfoHeader">' + type.name + '</div><div class="modaldeadline"><span class="clock' + type.dishId + '"></span></div>' +
                    '<div class="modalInfo"><p class="modalInfoText">' + type.description + '</p></div>' +
                    '<div class="modalOLDPrice">' + type.priceOriginal + '</div><div class="modalNEWPrice">' + type.priceNew + '</div>' +
                    '<a href="#close" title="Закрыть" class="close">X</a></div></div>');

                var timer = deadtime.getFullYear() + '/' + (deadtime.getMonth() + 1) + '/' + deadtime.getDate()+ ' ' + deadtime.getHours() + ':' + deadtime.getMinutes() + ':' + deadtime.getSeconds();

                $('.clock' + type.dishId)
                    .countdown(timer, function (event) {
                    $(this).html(event.strftime('%H:%M'));
                });
            }
        },
        error: function (error) {
            console.log(error)
        }
    });
}
function typeofdishesblock(typeOfDishes, fullKladr) {

    $('#HotDishesInside').html('');

    $.ajax({
        url: $hostRoot + "get/dishes/bytype?type=" + typeOfDishes + "&kladr=" + fullKladr,
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            $('#HotDeals h1').text(typeOfDishes.toUpperCase());

            $('hotDishes-preloader').hide();

            for (var i = 0; i < data.length; i++) {
                var type = data[i];
                var deadtime = new Date(type.deadline);
                $('#HotDishesInside')
                    .append('<a href="#' + type.dishId + '"><div class="dishes" index="' + type.dishId + '" style="background-image: url(../img/' + type.photo + '); background-size: cover;"><div class="deadline"><span class="clock' + type.dishId + '"></div><div class="addBasket" title="В корзину"><div class="addBasketPlus"></div></div><div class="dishesinfo"><div class="dishesinfotext">' + type.name + '</div><div class="dishesinfoOLDPrice">' + type.priceOriginal + '</div><div class="dishesinfoNEWPrice">' + type.priceNew + '</div></div></div></a>')
                    .append('<div id="' + type.dishId + '" class="modalDialog"><div><div class="modalImage" index="' + type.dishId + '" style="background-image: url(../img/' + type.photo + '); background-size: cover;"></div>' +
                    '<div class="modalInfoHeader">' + type.name + '</div><div class="modaldeadline"><span class="clock' + type.dishId + '"></div>' +
                    '<div class="modalInfo"><p class="modalInfoText">' + type.description + '</p></div>' +
                    '<div class="modalOLDPrice">' + type.priceOriginal + '</div><div class="modalNEWPrice">' + type.priceNew + '</div>' +
                    '<a href="#close" title="Закрыть" class="close">X</a></div></div>');

                var timer = deadtime.getFullYear() + '/' + (deadtime.getMonth() + 1) + '/' + deadtime.getDate()+ ' ' + deadtime.getHours() + ':' + deadtime.getMinutes() + ':' + deadtime.getSeconds();

                $('.clock' + type.dishId)
                    .countdown(timer, function (event) {
                        $(this).html(event.strftime('%H:%M'));
                    });
            }
        },
        error: function (error) {
            console.log(error);
        }
    });
}

