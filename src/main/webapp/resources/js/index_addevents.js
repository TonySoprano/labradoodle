/**
 * Created by proton on 10.12.2015.
 */
$(document).ready(function () {
    addEvents();
});

addEvents = function () {

    //add listener to oblast
    var oblast = "";
    $('#region-select').change(function () {
        oblast = $('#region-select option:selected').attr('index');
        if (typeof oblast == 'undefined') {
            $('#city-select').html('<option disabled>Выберите город</option>');
        } else {
            $('#street-select').html('<option disabled>Выберите улицу</option>');
            console.log(oblast);
            if ($('#HotDeals h1').text() == 'HOT DEALS') {
                hotdishesblock(oblast);
            }
            typeofdishesblock(typeOfDishes, oblast + city + street);
            $.ajax({
                url: $hostRoot + "get/kladrinfo?kladr=" + oblast,
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

    //add listener to city
    var city = "";
    $('#city-select').change(function () {
        city = $('#city-select option:selected').attr('index');
        if (typeof city == 'undefined') {
            $('#street-select').html('<option disabled>Выберите улицу</option>');
        } else {
            console.log(city);
            if ($('#HotDeals h1').text() == 'HOT DEALS') {
                hotdishesblock(oblast + city);
            }
            typeofdishesblock(typeOfDishes, oblast + city + street);
            $.ajax({
                url: $hostRoot + "get/kladrinfo?kladr=" + oblast + city,
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

    //add listener to street
    var street = "";
    $('#street-select').change(function () {
        street = $('#street-select option:selected').attr('index');
        console.log(street);
        if ($('#HotDeals h1').text() == 'HOT DEALS') {
            hotdishesblock(oblast + city + street);
        }
        typeofdishesblock(typeOfDishes, oblast + city + street);
    });

    //add listener to click on dishes type
    var typeOfDishes = '';
    $('#dishesTypes').on('click', '.blackRectangle', function () {
        typeOfDishes = $(this).children().attr('id');
        console.log(typeOfDishes);
        var fullKladr = oblast + city + street;
        console.log(fullKladr);

        $('#HotDishesInside').html('');

        typeofdishesblock(typeOfDishes, fullKladr);
    });
};