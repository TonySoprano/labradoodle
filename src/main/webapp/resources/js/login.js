/**
 * Created by barikos on 09.12.15.
 */
$(document).ready(function () {
    addEvents();
});

//Add event on click on enter in cabinet

addEvents = function () {
        $('#region-select').hide();
        $('#city-select').hide();
        $('#street-select').hide();
        $('#basket').hide();
        $('#HotDials h1').text('Log in');
};