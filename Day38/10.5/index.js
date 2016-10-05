angular.module("AppMod", ["ngRoute"])
	.controller("AppCtrl", ['$http', function($http) {
		var self = this;

		$http.get('http://localhost:8080/student')
			.then(function(resp){
				self.students = resp.data;
			},function(err) {

			});

			
			self.submit = function() {
				console.log("User clicked submit with user " + self.user);
			};
			


	}])
	.config(['$routeProvider', function($routeProvider) {

		$routeProvider
		.when('/', {
			templateUrl: 'views/view.home.html'

		}).when('/student', {
			templateUrl: 'views/view.student.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'

		}).when('/about', {
			templateUrl: 'views/view.about.html'

		})
		.when('/details', {
			templateUrl: 'views/view.details.html'

		})

		.otherwise({redirectTo: '/'});

	}]); // end config