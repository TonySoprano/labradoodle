/**
 * Created by proton on 07.12.2015.
 */
$(document).ready(function () {
    Events();
    basketCount();
});

Events = function () {

    //click by basket icon
    $('.head').on('click', '.basket', function () {
        $('#HotDishesInside').html('');
        $('#HotDeals h1').text('BASKET');

        $.ajax({
            url: $hostRoot + 'basket/get/alldishes',
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {

                for (var i = 0; i < data.length; i++) {
                    var type = data[i];
                    var date = new Date(type.dishDto.deadline);
                    $('#HotDishesInside')
                        .append('<a href="#' + type.dishDto.dishId + '"><div class="dishesBasket" index="' + type.dishDto.dishId + '"><div class="dishesBasketImage" style="background-image: url(../img/' + type.dishDto.photo + '); background-size: cover;"></div><div class="delBasket" title="Удалить из корзины"><div class="delBasketMinus"></div></div><div class="dishesinfo"><div class="dishesinfotextBasket">' + type.dishDto.name + '</div><div class="dishesinfoNEWPriceBasket">' + type.dishDto.priceNew + '</div></div></div></a>')
                        .append('<div id="' + type.dishDto.dishId + '" class="modalDialog"><div><div class="modalImage" index="' + type.dishDto.dishId + '" style="background-image: url(../img/' + type.dishDto.photo + '); background-size: cover;"></div>' +
                        '<div class="modalInfoHeader">' + type.name + '</div><div class="modaldeadline">' + date.getHours() + ':' + date.getMinutes() + '</div>' +
                        '<div class="modalInfo"><p class="modalInfoText">' + type.dishDto.description + '</p></div>' +
                        '<div class="modalOLDPrice">' + type.dishDto.priceOriginal + '</div><div class="modalNEWPrice">' + type.dishDto.priceNew + '</div>' +
                        '<a href="#close" title="Закрыть" class="close">X</a></div></div>');
                }
            },
            error: function (error) {
                console.log(error)
            }
        });
    });









    //click by basket icon
    $('.head').on('click', '.basket', function () {
        $('#HotDishesInside').html('');
        $('#HotDeals h1').text('BASKET');

        $.ajax({
            url: $hostRoot + 'basket/get/alldishes',
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {

                for (var i = 0; i < data.length; i++) {
                    var type = data[i];
                    var date = new Date(type.dishDto.deadline);
                    $('#HotDishesInside')
                        .append('<a href="#' + type.dishDto.dishId + '"><div class="dishes" index="' + type.dishDto.dishId + '" style="background-image: url(../img/' + type.dishDto.photo + '); background-size: cover;"><div class="deadline">' + date.getHours() + ':' + date.getMinutes() + '</div><div class="delBasket" title="Удалить из корзины"><div class="delBasketMinus"></div></div><div class="dishesinfo"><div class="dishesinfotext">' + type.dishDto.name + '</div><div class="dishesinfoOLDPrice">' + type.dishDto.priceOriginal + '</div><div class="dishesinfoNEWPrice">' + type.dishDto.priceNew + '</div></div></div></a>')
                        .append('<div id="' + type.dishDto.dishId + '" class="modalDialog"><div><div class="modalImage" index="' + type.dishDto.dishId + '" style="background-image: url(../img/' + type.dishDto.photo + '); background-size: cover;"></div>' +
                        '<div class="modalInfoHeader">' + type.name + '</div><div class="modaldeadline">' + date.getHours() + ':' + date.getMinutes() + '</div>' +
                        '<div class="modalInfo"><p class="modalInfoText">' + type.dishDto.description + '</p></div>' +
                        '<div class="modalOLDPrice">' + type.dishDto.priceOriginal + '</div><div class="modalNEWPrice">' + type.dishDto.priceNew + '</div>' +
                        '<a href="#close" title="Закрыть" class="close">X</a></div></div>');
                }
            },
            error: function (error) {
                console.log(error)
            }
        });
    });














    //var basketSum = 0;
    //click by add to basket
    $('#HotDishesInside').on('click', '.addBasket', function () {
        $('.modalDialog').hide();
        //basketSum += 1;
        //$('.basketCount').text(basketSum + basketCount()).show();
        //console.log('basketSum = ' + basketSum + basketCount());

        var dishId = $(this).parent('.dishes').attr('index');
        console.log('dishId = ' + dishId);

        $.ajax({
            url: $hostRoot + 'basket/add/dish?id=' + dishId,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.basketCount').text(data.countDishes).show();
            },
            error: function (error) {
                console.log(error)
            }
        });
    });

    //clic dy dell from basket
    $('#HotDishesInside').on('click', '.delBasket', function () {
        $('.modalDialog').hide();
        //basketSum += 1;
        //$('.basketCount').text(basketSum + basketCount()).show();
        //console.log('basketSum = ' + basketSum + basketCount());

        var dishId = $(this).parent('.dishes').attr('index');
        console.log('dishId = ' + dishId);

        $.ajax({
            url: $hostRoot + 'basket/delete/dish?id=' + dishId,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.basketCount').text(data.countDishes).show();
                $('.dishes').filter('[index="'+ dishId +'"]').remove();
            },
            error: function (error) {
                console.log(error)
            }
        });
    });
};

function basketCount() {
var result = 0;
    $.ajax({
        url: $hostRoot + 'basket/get/alldishes',
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {
            console.log(data.length);
            if (data.length > 0) {
                $('.basketCount').text(data.length);
                result = data.length;
            } else {
                console.log('data in basket is 0');
                $('.basketCount').text(0);
                result = 0;
            }

        },
        error: function (error) {
            console.log(error)
        }
    });

    return result;
}