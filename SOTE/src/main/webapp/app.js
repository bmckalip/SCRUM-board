//parameters: name of ng-app, array of imports
var app = angular.module("scrumBoard", ['ngRoute']);

app.config(function($routeProvider){
	
	$routeProvider
		.when('/homepage',   {	templateUrl: "static/features/homepage/homepage.html"	})
		.when('/board',  {	templateUrl: "static/features/board/board.html"	  		})
		.when('/logout', {	templateUrl: "static/features/login/login.html" 		})
}).config(['$qProvider', function ($qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
}]);

