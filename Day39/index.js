angular.module("AppMod", ["ngRoute"])

	.controller("AppCtrl", ['$http', '$routeParams', function($http, $routeParams) {
		var self = this;
		//console.log($routeParams);
		self.id = $routeParams.studentId;

		$http.get('http://localhost:8083/student')
			.then(function(resp){
				self.students = resp.data;
			},function(err) {

			});

		$http.get('http://localhost:8083/student/'+self.id)
			.then(function(resp){
				self.student = resp.data;
			},function(err) {

			});
			
			// self.submit = function() {
			// 	console.log("User clicked submit with user " + self.user);
			// };
			


	


	}])
	.config(['$routeProvider', function($routeProvider) {

		$routeProvider
		.when('/', {
			templateUrl: 'views/view.home.html'

		}).when('/student', {
			templateUrl: 'views/view.student.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'

		}).when('/student/:studentId', {
			templateUrl: 'views/view.detail.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'	

		}).when('/about', {
			templateUrl: 'views/view.about.html'

		})
		.when('/add', {
			templateUrl: 'views/view.add.html'

		})

		.otherwise({redirectTo: '/'});

	}]); // end config


	

	// .controller("AppCtrl", ['http', '$routeParams', function($http, $roueParams)])
	// self.id=$routeParams.studentId;



