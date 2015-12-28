/**
 * Created by proton on 25.12.2015.
 */

$(document).ready(function () {
    onStartCabinet();
    eventsCabinet();
});

onStartCabinet = function() {

    $.ajax({
        url: $hostRoot + "cabinet",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            var cabinetName = data[1].restaurant.name;
            console.log(cabinetName);
            $('#HotDeals h1').text(cabinetName);

            //$('#HotDishesInside').append('<div class="basketAccept"><hr><div class="basketAcceptButton">Заказать</div></div><hr>');

            for (var i = 0; i < data.length; i++) {
                var type = data[i];
                var deadtime = new Date(type.deadline);

                $('#HotDishesInside')
                    .append('<a href="#' + type.dishId + '"><div class="dishesBasket" index="' + type.dishId + '" value="' + type.priceNew + '"><div class="dishesBasketImage" style="background-image: url(../img/' + type.photo + '); background-size: cover;"><div class="deadline"><span class="clock' + type.dishId + '"></div></div><div class="delBasket" title="Удалить из кабинета"><div class="delBasketMinus"></div></div><div class="dishesinfoBasket"><div class="dishesinfotextBasket">' + type.name + '</div><div class="modalInfoBasket"><p class="modalInfoTextBasket">' + type.description + '</p></div></div><div class="dishesinfoNEWPriceBasket">' + type.priceNew + ",00" + '</div></div></a>');

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
};

eventsCabinet = function() {

    $('#cabinetAddButton').on('click', '.cabinetAcceptButton', function(){

        console.log('нажата кнопка Добавить блюдо');
    });

    $('#HotDishesInside').on('click', '.delBasket', function(){

        var delIdDish = $(this).parent().attr('index');
        console.log('нажата кнопка Удалить блюдо id блюда = ' + delIdDish);

        $.ajax({
            url: $hostRoot + "cabinet/delete" + delIdDish,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {

                alert('блюдо удалено');

            }, error: function (error) {
                console.log(error)
            }
        });
    });
};