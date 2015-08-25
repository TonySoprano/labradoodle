/**
 * Created by proton on 17.08.2015.
 */
$(document).ready(function () {
    onStart();
});

//function in start page
var onStart = function() {
    $.ajax({
        url: $hostRoot + "/get_dishes_type",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (data) {

            //remove dishes types preloader
            $('#dishesTypes-preloader').remove();

            //add circle with available dishes type
            for (i = 0; i < data.length; i++) {
                if (data[i] = 'PIZZA') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" style="background: url(../img/pizza.jpg) center no-repeat; background-size: 150%;"></div>')
                }
                if (data[i] = 'FISH') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" style="background: url(../img/fish.jpg) center no-repeat; background-size: 150%;"></div>')
                }
                if (data[i] = 'BURGERS') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" style="background: url(../img/burgers.jpg) center no-repeat; background-size: 150%;"></div>')
                }
                if (data[i] = 'CHINE') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" style="background: url(../img/burgers.jpg) center no-repeat; background-size: 150%;"></div>')
                }
                if (data[i] = 'SUSHI') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" style="background: url(../img/sushi.jpg) center no-repeat; background-size: 150%;"></div>')
                }
            }
        }
    });
};