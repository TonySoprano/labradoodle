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
                        .html('<div class="circle" id="PIZZA" style="background: url(../img/pizza.jpg) center no-repeat; background-size: 150%;"></div>');
                }
                if (data[i] = 'FISH') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" id="FISH" style="background: url(../img/fish.jpg) center no-repeat; background-size: 150%;"></div>');
                }
                if (data[i] = 'BURGERS') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" id="BURGERS" style="background: url(../img/burgers.jpg) center no-repeat; background-size: 150%;"></div>');
                }
                if (data[i] = 'CHINE') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" id="CHINE" style="background: url(../img/chine.jpg) center no-repeat; background-size: 150%;"></div>');
                }
                if (data[i] = 'SUSHI') {
                    $('#circleDishesTypes')
                        .html('<div class="circle" id="SUSHI" style="background: url(../img/sushi.jpg) center no-repeat; background-size: 150%;"></div>');
                }
            }
        }
    });
};

$('#PIZZA').on('click', function() {
    $.ajax({
        url: $hostRoot + "/get_dishes_by_type/PIZZA",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (data) {

            //remove dishes type
            $('.circle').remove();

            //remove hot offers
            $('#blocks').remove();

            for (i = 0; i < data.length; i++) {
                $('#circleDishesTypes').html('<div class="circle" id="PIZZA"  index="[data.id]" style="background: url(../img/pizza.jpg) center no-repeat; background-size: 150%;">Пицца $('data[i]').text()</div>');
            }
        }
    });
});

$('#FISH').on('click', function() {
    $.ajax({
        url: $hostRoot + "/get_dishes_by_type/FISH",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (data) {

            //remove dishes type
            $('.circle').remove();

            //remove hot offers
            $('#blocks').remove();

            for (i = 0; i < data.length; i++) {
                $('#circleDishesTypes').html('<div class="circle" id="FISH" index="[data.id]" style="background: url(../img/fish.jpg) center no-repeat; background-size: 150%;">Рыба $('data[i]').text()</div>');
            }
        }
    });
});

$('#BURGERS').on('click', function() {
    $.ajax({
        url: $hostRoot + "/get_dishes_by_type/BURGERS",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (data) {

            //remove dishes type
            $('.circle').remove();

            //remove hot offers
            $('#blocks').remove();

            for (i = 0; i < data.length; i++) {
                $('#circleDishesTypes').html('<div class="circle" id="BURGERS" index="[data.id]" style="background: url(../img/burgers.jpg) center no-repeat; background-size: 150%;">Бургер $('data[i]').text()</div>');
            }
        }
    });
});

$('#CHINE').on('click', function() {
    $.ajax({
        url: $hostRoot + "/get_dishes_by_type/CHINE",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (data) {

            //remove dishes type
            $('.circle').remove();

            //remove hot offers
            $('#blocks').remove();

            for (i = 0; i < data.length; i++) {
                $('#circleDishesTypes').html('<div class="circle" id="CHINE" index="[data.id]" style="background: url(../img/chine.jpg) center no-repeat; background-size: 150%;">Мясо $('data[i]').text()</div>');
            }
        }
    });
});

$('#SUSHI').on('click', function() {
    $.ajax({
        url: $hostRoot + "/get_dishes_by_type/SUSHI",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (data) {

            //remove dishes type
            $('.circle').remove();

            //remove hot offers
            $('#blocks').remove();

            for (i = 0; i < data.length; i++) {
                $('#circleDishesTypes').html('<div class="circle" id="SUSHI" index="[data.id]" style="background: url(../img/chine.jpg) center no-repeat; background-size: 150%;">Суши $('data[i]').text()</div>');
            }
        }
    });
});

