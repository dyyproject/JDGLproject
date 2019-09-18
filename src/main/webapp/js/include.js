$(function () {
    $.get("head.html",function (data) {
        $("#header").html(data);
    });
    $.get("foot.html",function (data) {
        $("#footer").html(data);
    });
});