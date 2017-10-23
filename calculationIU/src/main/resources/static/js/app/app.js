var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://localhost:8080/calculationUI',
    USER_SERVICE_API : 'http://localhost:8888/service/calculation',
    CURCUIT_BREAKER_SERVICE_API : 'http://localhost:8090/calcCircuitBreaker'
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'partials/list',
                
            });
        $urlRouterProvider.otherwise('/');
    }]);