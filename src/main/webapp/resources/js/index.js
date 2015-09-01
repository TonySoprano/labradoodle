/**
 * Created by proton on 17.08.2015.
 */
$(document).ready(function () {
    onStart();
});

//function in start page
var onStart = function() {
    $.ajax({
        url: $hostRoot + "/typesofdishes",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            //remove dishes types preloader
            $('#dishesTypes-preloader').hide();

            //add circle with available dishes type
            for (i = 0; i < data.length; i++) {
                var type = data[i].toLowerCase();
                    $('#circleDishesTypes')
                        .addClass('container center-block')
                        .append('<div class="circle type-of-dishes" index="'+ type +'" style="background: url(../img/'+ type +'.jpg) center no-repeat; background-size: 150%;"></div>');
            }
        },
        error: function (error) {
            console.log(error)
        }

    });
};

$('.type-of-dishes').on('click', function() {

    var type = $(this).attr('index');

    $.ajax({
        url: $hostRoot + "/get/dishes/" + type,
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            //remove dishes type
            $('.circle').hide();

            //remove hot offers
            $('#blocks').hide();

            for (i = 0; i < data.length; i++) {
                $('#circleDishesTypes')
                    .addClass('container center-block')
                    .append('<div class="circle" index="'+ data.id +'" style="background: url(../img/'+ data[i].photo +') center no-repeat; background-size: 150%;"></div>');
            }
        },
        error: function (error) {
            console.log(error)
        }
    });
});

$('.circle').on('click', function() {

    var id = $(this).attr('index');

    $.ajax({
        url: $hostRoot + "/get_dish/" + id,
        type: 'get',
        success: function (data) {

                //remove dishes by type
                $('.circle').remove();

                $('#circleDishesTypes')
                    .addClass('container center-block')
                    .append('<div><img src="'+ data.photo +'"><img>"'+ data.TypeDishes + ' '+ data.Name +' '+ data.Description +' '+data.Price_Original +' '+ data.Price_new +'"</div>');
            },
            error: function (error) {
                console.log(error)
            }
    });
});