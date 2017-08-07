app.controller("homepageCtrl", function($scope, $rootScope, $location){
	//validation
	if(!$rootScope.user){ $location.path("/logout"); }
	
	console.log("valid homepage loading");
})