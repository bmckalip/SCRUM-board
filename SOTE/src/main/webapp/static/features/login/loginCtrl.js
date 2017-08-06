/**
 * loginCtrl.js
 * 
 * for module:
 * 		scrumBoard
 */


	app.controller('loginCtrl', function($scope, $http, $rootScope){
		$scope.data = {
				email : "",
				password : ""
		};
		$scope.loginSubmit = function(){
			console.log('testing')

//			var url="http://localhost:8085/SOTE/rest/login";
//			var user= 
//			{
//				    "userId": null,
//				    "userEmail": $scope.data.email,
//				    "userPassword": $scope.data.password,
//				    "permission": null,
//				    "userFirstName": null,
//				    "userLastName": null
//				}
//			var parameter = JSON.stringify(user);
//				$http.post(url, parameter).
//				success(function(data, status, headers, config) { //valid
//					console.log(data);
//				}). error(function(data, status, headers, config) {invalid });	

		}
	})	;

