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
                $('#forDishes').append('<div class="blackRectangle"><div id="'+type+'"></div><div class="infoText">'+type.toUpperCase()+'</div></div>');
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
                regions += "<option id= \"" + region.region + "\" index= \""+ region.regionId + "\" class=region >" + region.region +"</option>";
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
                        .append('<a href="#openModal"><div class="dishes"><div class="deadline">1:40</div><div class="dishesinfo"><div class="dishesinfotext">Caesar salad</div><div class="dishesinfoOLDPrice">120</div><div class="dishesinfoNEWPrice">109</div></div></div></a>');
                //}
            },
            error: function (error) {
                console.log(error)
            }
        });
};
addEvents = function () {
    var oblast = "";
    $('#region-select').change(function () {
        oblast = $('#region-select option:selected').attr('index');
        if (typeof oblast == 'undefined') {
            $('#city-select').html('<option disabled>Выберите город</option>');
        } else {
            console.log(oblast);
            $.ajax({
                url: $hostRoot + "get/cladrinfo?cladr=" + oblast,
                type: 'get',
                dataType: 'json',
                contentType: 'application/json',
                success: function (data) {
                    var cities = "";
                    for (var i = 0; i < data.length; i++) {
                        var city = data[i];
                        cities += "<option id= \"" + city.city + "\" index= \"" + city.cityId + "\" class=city >" + city.city + "</option>";
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
        city = $('#city-select option:selected').attr('index');
        if (typeof city == 'undefined') {
            $('#street-select').html('<option disabled>Выберите улицу</option>');
        } else {
            console.log(city);
            $.ajax({
                url: $hostRoot + "get/cladrinfo?cladr=" + oblast + city,
                type: 'get',
                dataType: 'json',
                contentType: 'application/json',
                success: function (data) {
                    var streets = "";
                    for (var i = 0; i < data.length; i++) {
                        var street = data[i];
                        streets += "<option id= \"" + street.street + "\" index= \"" + street.streetId + "\" class=street >" + street.street + "</option>";
                    }
                    $('#street-select').html('<option disabled selected>Выберите улицу</option>' + streets);
                },
                error: function (error) {
                    console.log(error)
                }
            });
        }
    });
    var street = "";
    $('#street-select').change(function() {
        street = $('#street-select option:selected').attr('index');
        console.log(street);
    });

    $('#dishesTypes').on('click', '.blackRectangle', function() {
        var typeOfDishes = $(this).children().attr('id');
        console.log(typeOfDishes);
        var fullCladr = oblast + city + street;
        console.log(fullCladr);

        $.ajax({
            url: $hostRoot + "get/dishes/bytype?type=" + typeOfDishes + "&cladr=" + fullCladr,
            type: 'get',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
                console.log(data);
            },
            error: function (error) {
                console.log(error);
            }
        });
    });
};