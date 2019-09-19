app.service('indexService',function ($http) {

    this.selectRole=function (username) {
        return $http.get('user/selectRole.do?username='+username)
    }
});