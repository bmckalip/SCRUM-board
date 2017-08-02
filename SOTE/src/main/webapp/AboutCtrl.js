/**
 * Controller for the about me page 
 */
var app = angular.module("angularBasicsApp");

app.controller('aboutCtrl', function($scope){
	console.log("about me controller - test");
	$scope.myVar = 55;
})

.controller('aboutChildCtrl', function($scope){
	$scope.newVar = "childVar"
})

