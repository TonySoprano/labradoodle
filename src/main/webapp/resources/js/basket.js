/**
 * Created by proton on 07.12.2015.
 */
$(document).ready(function () {
    Events();
});

var Events = function () {

    //click by basket icon
    $('.head').on('click', '.basket', function () {
        $('#HotDishesInside').html('');
        $('#HotDeals h1').text('BASKET');
    });

    //load dishes in basket
    //$.ajax({
    //    url: $hostRoot + 'basket/get/alldishes',
    //    type: 'get',
    //    dataType: 'json',
    //    contentType: 'application/json',
    //    success: function (data) {
    //
    //
    //    },
    //    error: function (error) {
    //        console.log(error)
    //    }
    //});

    //click by add to basket
    var basketCount = 0;
    $('#HotDishesInside').on('click', '.addBasket', function () {
        $('.modalDialog').hide();
        basketCount += 1;
        $('.basketCount').text(basketCount).show();
        console.log(basketCount);
    });

};