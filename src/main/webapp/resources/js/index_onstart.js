/**
 * Created by proton on 10.12.2015.
 */
$(document).ready(function () {
    onStart();
});

//change images on background
var total_pics_num = 4; // колличество изображений
var interval = 6000;    // задержка между изображениями
var time_out = 25;       // задержка смены изображений
var i = 0;
var timeout;
var opacity = 100;
function fade_to_next() {
    opacity--;
    var k = i + 1;
    var image_now = 'image_' + i;
    if (i == total_pics_num) k = 1;
    var image_next = 'image_' + k;
    document.getElementById(image_now).style.opacity = opacity/100;
    document.getElementById(image_now).style.filter = 'alpha(opacity='+ opacity +')';
    document.getElementById(image_next).style.opacity = (100-opacity)/100;
    document.getElementById(image_next).style.filter = 'alpha(opacity='+ (100-opacity) +')';
    timeout = setTimeout("fade_to_next()",time_out);
    if (opacity==1) {
        opacity = 100;
        clearTimeout(timeout);
    }
}
setInterval (
    function() {
        i++;
        if (i > total_pics_num) i=1;
        fade_to_next();
    }, interval
);

//function in start page
var onStart = function () {

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
