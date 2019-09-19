app.service('indexService',function ($http) {

    this.selectUsername=function () {
        return $http.get('../user/selectUsername.do');
    }

    this.findOne=function () {
        return $http.get('../user/findOne.do');
    }

});