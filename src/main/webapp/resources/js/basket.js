/**
 * Created by proton on 07.12.2015.
 */
$(document).ready(function () {
    Events();
});

var Events = function() {

    $('.head').on('click', '.basket', function() {
        $('#HotDishesInside').html('');
        $('#HotDeals h1').text('Basket');
    })

};