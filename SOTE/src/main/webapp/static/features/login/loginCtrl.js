/**
 * loginCtrl.js
 * 
 * for module:
 * 		scrumBoard
 * @author Adeo, Brian
 */


	app.controller('loginCtrl', function($scope, $http, $rootScope, $location){
		$rootScope.user = null;
		
		$scope.data = {
				email : "",
				password : ""
		};
		
		$scope.submitLogin = function(){
			var url ="http://localhost:8085/SOTE/rest/login";
			var user = {
				    "userEmail": $scope.data.email,
				    "userPassword": $scope.data.password,
			}
			
			var parameter = JSON.stringify(user);
				$http.post(url, parameter)
				.then(
					function(response){
						console.log(response.data);
						$rootScope.user = response.data;
						$location.path('/homepage')
					},
					
					function(response){
						console.log(response.data);
						$rootScope.user = null;
					}
				);
		}
	});

