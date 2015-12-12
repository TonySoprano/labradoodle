/**
 * Created by proton on 10.12.2015.
 */
$(document).ready(function () {
    onStart();
});

//function in start page
var onStart = function () {

    $('.basketCount').hide();

    //get type of dishes
    $.ajax({
        url: $hostRoot + "get/typesofdishes",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            //remove dishes types preloader
            $('#dishesTypes-preloader').hide();

            //add available dishes type
            for (var i = 0; i < data.length; i++) {
                var type = data[i].toLowerCase();
                $('#forDishes').append('<div class="blackRectangle"><div id="' + type + '"></div><div class="infoText">' + type.toUpperCase() + '</div></div>');
            }
        },
        error: function (error) {
            console.log(error)
        }

    });

    //get kladr by alex barkovsky
    $.ajax({
        url: $hostRoot + "get/kladrinfo?kladr=",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {
            var regions = "";
            for (var i = 0; i < data.length; i++) {
                var region = data[i];
                regions += "<option id= \"" + region.region + "\" index= \"" + region.regionId + "\" class=region >" + region.region + "</option>";
            }
            $('#region-select').html('<option disabled selected>Выберите область</option>' + regions);
        },
        error: function (error) {
            console.log(error)
        }
    });

    //add block with hot dishes
    hotdishesblock();
};
