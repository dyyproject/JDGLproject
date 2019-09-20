app.controller('indexController', function ($scope, $location, indexService) {
    $scope.users = {};
    $scope.selectUsername = function () {
        indexService.selectUsername().success(
            function (response) {
                $scope.users.username = response.username;
            }
        )
    }
    $scope.findName = function () {
        indexService.findName().success(
            function (response) {
                $scope.users = response;
            }
        )
    };


    $scope.findOne = function (username) {
        indexService.findOne(username).success(
            function (response) {
                $scope.users = response;
            }
        )
    };

    $scope.logout = function () {
        indexService.logout().success(
            function (response) {
                location.href = "../login.html";
            }
        )
    }

    $scope.search = function () {
        roomService.search($scope.searchString).success(
            function (response) {
                if (response.success) {
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
    $scope.close = function () {
        location.href = "/admin/index.html";
    }

    /**
     * 新建users
     */
    $scope.addUsers = function () {
        if ($scope.users.id != null) {
            indexService.updateUser($scope.users).success(
                function (response) {
                    if (response.success) {
                        $scope.findAll();
                    } else {
                        alert(response.message);
                    }
                })
        } else {
            indexService.addUsers($scope.users).success(
                function (response) {
                    if (response.success) {
                        $scope.findAll();
                    } else {
                        alert(response.message);
                    }
                }
            )
        }
    }

    $scope.findAll = function () {
        indexService.findAll().success(
            function (response) {
                $scope.entity = response;
            }
        )
    };

    $scope.delete = function (username) {
        indexService.delete(username).success(
            function (response) {
                if (response.success) {
                    $scope.findAll();
                } else {
                    alert(response.message);
                }
            }
        )
    }

    /**
     * 修改users权限
     */
    $scope.updateUser = function (users) {
        indexService.updateUser(users).success(
            function (response) {
                if (response.success) {
                    $scope.findAll();
                } else {
                    alert(response.message)
                }
            }
        )
    }
});