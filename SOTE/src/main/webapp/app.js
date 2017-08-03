//parameters: name of ng-app, array of imports
var app = angular.module("scrumBoard", ['ngRoute']);

app.config(function($routeProvider){
	$routeProvider
		.when('/home',   {	templateUrl: "static/features/homepage/homepage.html"	  })
		.when('/board',  {	templateUrl: "static/features/board/board.html"	  })
		.when('/logout', {	templateUrl: "static/features/login/login.html" })
});

