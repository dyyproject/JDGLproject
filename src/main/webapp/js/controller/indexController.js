app.controller('indexController',function ($scope, $location,indexService) {
    $scope.users={};
    $scope.selectUsername=function () {
        indexService.selectUsername().success(
            function (response) {
                $scope.users.username=response.username;
            }
        )
    }
    $scope.findOne=function(){
        indexService.findOne().success(
            function (response) {
                $scope.users=response;
            }
        )
    }

    $scope.logout=function () {
       indexService.logout().success(
           function (response) {
               location.href="http://baidu.com";
           }
       )
    }

});