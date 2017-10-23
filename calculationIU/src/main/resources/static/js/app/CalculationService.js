'use strict';

angular.module('crudApp').factory('CalculationService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                		calcAddition:calcAddition,
                		calcSubtraction:calcSubtraction,
                		calcMultiplication:calcMultiplication
                
            };

            return factory;

     

         
/*-----------------------------------Addition---------------------------------*/ 
         
            function calcAddition(calc) {
                console.log('--Addition---');
                var deferred = $q.defer();
                //$http.post(urls.USER_SERVICE_API+'/add', calc)
                $http.post(urls.CURCUIT_BREAKER_SERVICE_API+'/add', calc)
                    .then(
                        function (response) {
                             console.log("Successful Addition---------");
                        	 deferred.resolve(response);
                        },
                        function (errResponse) {
                        	console.log("Error Addition---------");
                           console.error('Error while Addition : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
            
/*------------------------------------------------Subtraction---------------------------------*/            
            
            function calcSubtraction(calc) {
                console.log('------------------Subtraction----------------');
                var deferred = $q.defer();
                $http.post(urls.USER_SERVICE_API+'/subtraction', calc)
                    .then(
                        function (response) {
                             console.log("Successful Subtraction---------");
                        	 deferred.resolve(response);
                        },
                        function (errResponse) {
                        	console.log("Error Subtraction---------");
                           console.error('Error while Subtraction : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

/*------------------------------------------------Multiplication---------------------------------*/            
            
            function calcMultiplication(calc) {
                console.log('------------------Multiplication----------------');
                var deferred = $q.defer();
                $http.post(urls.USER_SERVICE_API+'/multiplication', calc)
                    .then(
                        function (response) {
                             console.log("Successful Multiplication---------");
                        	 deferred.resolve(response);
                        },
                        function (errResponse) {
                        	console.log("Error Multiplication---------");
                           console.error('Error while Multiplication : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
     

      

        }
    ]);