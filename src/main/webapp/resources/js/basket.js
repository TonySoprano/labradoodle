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
                        .append('<a href="#' + type.dishDto.dishId + '"><div class="dishesBasket" index="' + type.dishDto.dishId + '"><div class="dishesBasketImage" style="background-image: url(../img/' + type.dishDto.photo + '); background-size: cover;"></div><div class="delBasket" title="Удалить из корзины"><div class="delBasketMinus"></div></div><div class="dishesinfoBasket"><div class="dishesinfotextBasket">' + type.dishDto.name + '</div><div class="modalInfoBasket"><p class="modalInfoTextBasket">' + type.dishDto.description + '</p></div></div><div class="dishesCountBasket"></div><div class="dishesinfoNEWPriceBasket">' + type.dishDto.priceNew +",00"+ '</div></div></a>')

                }
                $('#HotDishesInside').append('<div class="basketAccept"><hr><div class="basketPrice">Всего: </div><div class="basketAcceptButton">Заказать</div></div>')
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

        var dishId = $(this).parent('.dishesBasket').attr('index');
        console.log('dishId = ' + dishId);

        $.ajax({
            url: $hostRoot + 'basket/delete/dish?id=' + dishId,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                $('.basketCount').text(data.countDishes).show();
                $('.dishesBasket').filter('[index="'+ dishId +'"]').hide(300);
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