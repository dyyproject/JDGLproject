app.controller('indexController',function ($scope, $location,indexService) {

    $scope.selectUsername=function () {$scope.users={username:"",role:""}
        $scope.username = $location.search()['id'];
    }
    $scope.selectRole=function () {
        indexService.selectRole($scope.username).success(
            function (response){
                if (response.success) {
                    $scope.users.role="1";
                }else {
                    $scope.users.role="2";
                }
            }
        )
    }
});