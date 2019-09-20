app.service("roomService", function ($http) {

    this.search = function (searchString) {
        return $http.get('/room/search.do?condition=' + searchString);
    }

})