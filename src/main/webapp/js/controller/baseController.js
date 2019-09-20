app.controller("baseController", function ($scope) {
    //分页插件
    $scope.paginationConf = {
        currentPage: 1,//当前页
        totalItems: 10,//总页数
        itemsPerPage: 10,//每页记录数
        perPageOptions: [10, 20, 30, 40, 50],//分页选项
        onChange: function () {//当页码变更后自动触发的方法
            $scope.reloadList();//重新加载
        }
    }

    //刷新
    $scope.reloadList = function () {
        $scope.findAll($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    }

    //用户勾选复选框
    $scope.selectIds = [];

    $scope.updateSelection = function ($event, id) {
        if ($event.target.checked) {
            $scope.selectIds.push(id);
        } else {
            var index = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(index, 1);
        }
    }

    //将JSON转换为字符串

    $scope.jsonToString = function (jsonString, key) {
        if (key == null) {
            key = "text";
        }
        var json = JSON.parse(jsonString);
        var value = "";

        for (var i = 0; i < json.length; i++) {
            if (i == json.length - 1) {
                value += json[i][key];
            } else {
                value += json[i][key] + ",";
            }
            //value += json[i][key] + ",";
        }
        return value;
    }
})