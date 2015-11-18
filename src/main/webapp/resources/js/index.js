/**
 * Created by proton on 17.08.2015.
 */
$(document).ready(function () {
    onStart();
    addEvents();
});

//function in start page
    var onStart = function() {

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
            for (i = 0; i < data.length; i++) {
                var type = data[i].toLowerCase();
                    $('#forDishes').append('<div id="'+type+'" class="blackRectangle"><div class="info"></div> <div class="infoText">'+type.toUpperCase()+'</div></div>');
            }
        },
        error: function (error) {
            console.log(error)
        }

    });

    //get kladr by alex barkovsky
    $.ajax({
        url: $hostRoot + "get/cladrinfo?cladr=",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {
            var regions = "";
            for (var i = 0; i < data.length; i++) {
                var region = data[i];
                regions += "<option id= \"" + region.region + "\" index= \""+ region.region_id + "\" class=region >" + region.region +"</option>";
                }
                $('#region-select').html('<option disabled selected>Выберите область</option>' + regions);
            },
            error: function (error) {
                console.log(error)
            }

        });

    //add block with hot dishes
    $.ajax({
        url: $hostRoot + "get/hotdishes?cladr=",
        type: 'get',
        dataType: 'json',
        contentType: 'application/json',
        success: function (data) {

            //remove hot dishes preloader
            $('#hotDishes-preloader').hide();

            //add hot disshes
            //for (i = 0; i < data.length; i++) {
            //    var type = data[i].toLowerCase();

                //temporary code block dishes
                $('#HotDishesInside')
                        .append('<div class="dishes"><div class="dishesinfo"><div class="dishesinfotext">Caesar salad</div></div>')
                //}
            },
            error: function (error) {
                console.log(error)
            }
        });
};
addEvents = function () {
    $('#circleDishesTypes').on('click', '.type-of-dishes', function () {

        var type = $(this).attr('index');

        $.ajax({
            url: $hostRoot + "get/dishes/" + type,
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
                        .append('<div class="circle" index="' + data.id + '" style="background: url(../img/' + data[i].photo + ') center no-repeat; background-size: 150%;"></div>');
                }
            },
            error: function (error) {
                console.log(error)
            }
        });

    });
    var oblast = "";
    $('#region-select').change(function () {
        oblast = $('select option:selected').attr('index');
        if (typeof oblast == 'undefined') {
            $('#city-select').html('<option disabled>Выберите город</option>');
        } else {
            var cladr = oblast;
            $.ajax({
                url: $hostRoot + "get/cladrinfo?cladr=" + oblast,
                type: 'get',
                dataType: 'json',
                contentType: 'application/json',
                success: function (data) {
                    var cities = "";
                    for (var i = 0; i < data.length; i++) {
                        var city = data[i];
                        cities += "<option id= \"" + city.city + "\" index= \"" + city.id + "\" class=city >" + city.city + "</option>";
                    }
                    $('#city-select').html('<option disabled selected>Выберите город</option>' + cities);
                },
                error: function (error) {
                    console.log(error)
                }
            });
        }
    });
    var city = "";
    $('#city-select').change(function () {
        city = $('select option:selected').attr('index');
        if (typeof city == 'undefined') {
            $('#street-select').html('<option disabled>Выберите улицу</option>');
        } else {
            $.ajax({
                url: $hostRoot + "get/cladrinfo?cladr=" + oblast + city,
                type: 'get',
                dataType: 'json',
                contentType: 'application/json',
                success: function (data) {
                    var streets = "";
                    for (var i = 0; i < data.length; i++) {
                        var street = data[i];
                        streets += "<option id= \"" + street.street + "\" index= \"" + street.street_id + "\" class=city >" + street.street + "</option>";
                    }
                    $('#street-select').html('<option disabled selected>Выберите улицу</option>' + streets);
                },
                error: function (error) {
                    console.log(error)
                }
            });

            $('.circle').on('click', function () {

                var id = $(this).attr('index');

                $.ajax({
                    url: $hostRoot + "get_dish/" + id,
                    type: 'get',
                    success: function (data) {

                        //remove dishes by type
                        $('.circle').remove();

                        $('#circleDishesTypes')
                            .addClass('container center-block')
                            .append('<div><img src="' + data.photo + '"><img>"' + data.TypeDishes + ' ' + data.Name + ' ' + data.Description + ' ' + data.Price_Original + ' ' + data.Price_new + '"</div>');
                    },
                    error: function (error) {
                        console.log(error)
                    }
                });
            });
        }
    })
};