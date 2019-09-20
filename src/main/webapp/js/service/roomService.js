app.service("roomService", function ($http) {

    this.search = function () {
        return $http.get('/room/search.do?search=' + search);
    }

})