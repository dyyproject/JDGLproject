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

    $scope.search=function () {
        roomService.search($scope.searchString).success(
            function (response) {
                if (response.success){
                    $scope.findAll();
                } else {
                    alert(response.message);
                }
            }
        )
    };

    /**
     * 关闭返回index
     */
    $scope.close=function(){
        location.href="/admin/index.html";
    }

    /**
     * 新建users
     */
    $scope.addUsers=function () {
        indexService.addUsers($scope.ent).success(
            function (response) {
                if (response.success){
                    $scope.findAll();
                } else {
                    alert(response.message);
                }
            }
        )
    }

});