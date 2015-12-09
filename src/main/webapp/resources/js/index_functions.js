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

            //add hot dishes
            for (var i = 0; i < data.length; i++) {
                var type = data[i];
                var date = new Date(type.deadline);
                $('#HotDishesInside')
                    .append('<a href="#' + type.dishId + '"><div class="dishes" style="background-image: url(../img/' + type.photo + '); background-size: cover;"><div class="deadline">' + date.getHours() + ':' + date.getMinutes() + '</div><div class="dishesinfo"><div class="dishesinfotext">' + type.name + '</div><div class="dishesinfoOLDPrice">' + type.priceOriginal + '</div><div class="dishesinfoNEWPrice">' + type.priceNew + '</div></div></div></a>')
                    .append('<div id="' + type.dishId + '" class="modalDialog"><div><div class="modalImage" style="background-image: url(../img/' + type.photo + '); background-size: cover;"></div>' +
                    '<div class="modalInfoHeader">' + type.name + '</div><div class="modaldeadline">' + date.getHours() + ':' + date.getMinutes() + '</div>' +
                    '<div class="modalInfo"><p class="modalInfoText">' + type.description + '</p></div>' +
                    '<div class="modalOLDPrice">' + type.priceOriginal + '</div><div class="modalNEWPrice">' + type.priceNew + '</div>' +
                    '<a href="#close" title="Закрыть" class="close">X</a></div></div>');
            }
        },
        error: function (error) {
            console.log(error)
        }
    });
}