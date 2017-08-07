/**
 * loginCtrl.js
 * 
 * for module:
 * 		scrumBoard
 * @author Adeo, Brian
 */

		
	app.controller('loginCtrl', function($scope, $http, $location, $rootScope){
		$rootScope.user = null;
//		console.log($rootScope.baseURL);
		var url = "http://52.14.196.207:8085/SOTE/rest/login";
		$scope.data = {
				email : "",
				password : ""
		};
		$scope.submitLogin = function(){
			
			
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

