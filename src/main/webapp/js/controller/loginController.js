app.controller('loginController',function ($scope,$location,loginService) {
    $scope.loginUser=function () {
        loginService.loginUser($scope.users).success(
            function (response) {
                if (response.success){
                    location.href="index.html#username="+$scope.users.username;
                } else {
                    alert(response.message);
                }
            }
        )
    }
});