/**
 * Created by proton on 07.12.2015.
 */
$(document).ready(function () {
    Events();
    basketCount();
});

Events = function () {
    var priceAll=0;
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

                    $('#HotDishesInside')
                        .append('<a href="#' + type.dishDto.dishId + '"><div class="dishesBasket" index="' + type.dishDto.dishId + '" value="' + type.dishDto.priceNew + '"><div class="dishesBasketImage" style="background-image: url(../img/' + type.dishDto.photo + '); background-size: cover;"></div><div class="delBasket" title="Удалить из корзины"><div class="delBasketMinus"></div></div><div class="dishesinfoBasket"><div class="dishesinfotextBasket">' + type.dishDto.name + '</div><div class="modalInfoBasket"><p class="modalInfoTextBasket">' + type.dishDto.description + '</p></div></div><div class="dishesCountBasket">'+ type.count +'</div><div class="dishesinfoNEWPriceBasket">' + type.dishDto.priceNew*type.count +",00"+ '</div></div></a>');
                    priceAll+=type.dishDto.priceNew*type.count;
                }
                $('#HotDishesInside').append('<div class="basketAccept"><hr><div class="basketPrice">Всего: '+priceAll+',00</div><div class="basketAcceptButton">Заказать</div></div>')
            },
            error: function (error) {
                console.log(error)
            }
        });
    });

    //click by add to basket
    $('#HotDishesInside').on('click', '.addBasket', function () {
        $('.modalDialog').hide();

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


    //click by dell from basket
    $('#HotDishesInside').on('click', '.delBasket', function () {
        $('.modalDialog').hide();

        var dishId = $(this).parent('.dishesBasket').attr('index');
        var priceDish = $(this).parent('.dishesBasket').attr('value');

        $.ajax({
            url: $hostRoot + 'basket/delete/dish?id=' + dishId,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.basketCount').text(data.countDishes).show();
                var sumCurrentDishes = $('.dishesBasket').filter('[index="'+ dishId +'"]').children('.dishesCountBasket').text();

                if ( sumCurrentDishes == 1 ) {
                    $('.dishesBasket').filter('[index="'+ dishId +'"]').hide(300);
                    priceAll=priceAll-priceDish;
                    $('.basketAccept').children('.basketPrice').text('Всего: '+priceAll+',00');
                } else {
                    sumCurrentDishes -= 1;
                    $('.dishesBasket').filter('[index="'+ dishId +'"]').children('.dishesCountBasket').text(sumCurrentDishes);
                    priceAll=priceAll-priceDish;
                    $('.basketAccept').children('.basketPrice').text('Всего: '+priceAll+',00');
                    $('.dishesBasket').filter('[index="'+ dishId +'"]').children('.dishesinfoNEWPriceBasket').text(priceDish*sumCurrentDishes+',00');
                }
            },
            error: function (error) {
                console.log(error)
            }
        });
    });

    //click by to order button
    $('#HotDishesInside').on('click', '.basketAcceptButton', function () {
        //$('.dishesBasket').html('');
        $('#HotDeals h1').text('YOUR ORDER IS ACCEPTED');

        alert("Ваш заказ принят! Менеджер свяжется с вами в ближайшее время");

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