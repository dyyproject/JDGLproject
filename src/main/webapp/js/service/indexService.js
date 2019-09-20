app.service('indexService',function ($http) {

    this.selectUsername=function () {
        return $http.get('../user/selectUsername.do');
    }

    this.findOne=function () {
        return $http.get('../user/findOne.do');
    }

    this.logout=function () {
        return $http.get('/logout');
    }

    this.findAll=function () {
        return $http.get('../user/findAll.do');
    }

    this.delete=function (username) {
        return $http.get('../user/deleteUsers.do?username='+username);
    }

    this.addUsers=function (ent) {
        return $http.post('../user/addUsers.do',ent);
    }

    this.findAll=function () {
        return $http.get('../user/findAll.do');
    }
});