$(function () {
    $.get("head.html",function (data) {
        $("#header").html(data);
    });

});