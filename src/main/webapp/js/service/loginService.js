app.service('loginService',function ($http) {

    this.loginUser=function (users) {
        return $http.post('user/loginUsers.do',users)
    }
});