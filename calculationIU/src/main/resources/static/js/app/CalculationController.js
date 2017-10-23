'use strict';

angular.module('crudApp').controller('CalculationController',
    ['CalculationService', '$scope',  function( CalculationService, $scope) {

        var self = this;
        self.calc = {};
        

        self.submit = submit;
        
        self.calcAddition = calcAddition;
        self.calcSubtraction = calcSubtraction;
        self.calcMultiplication = calcMultiplication;
        //self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function submit() {
            console.log('Submitting');
           
            if (self.calc.operation === 'addition' ) {
                console.log('addition', self.calc);
                calcAddition(self.calc);
            } else if(self.calc.operation === 'subtraction') {
                calcSubtraction(self.calc);
                console.log('Subtraction ', self.calc);
            }else{
            	calcMultiplication(self.calc);
                 console.log('calcMultiplication ', self.calc);
            }
        }
/*-------------------------------Addition----------------------------------------*/
        function calcAddition(calc) {
            console.log('About to addition');
            CalculationService.calcAddition(calc)
                .then(
                    function (response) {
                        console.log('Added successfully');
                        self.successMessage = response.data.successMessage;
                    	self.errorMessage='';
                        self.done = true;
                        self.calc={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while Addition');
                        self.errorMessage = 'Error while Addition: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }

/*-----------------------------------------Subtraction--------------------------------*/
        
        function calcSubtraction(calc) {
            console.log('About to Subtraction');
            CalculationService.calcSubtraction(calc)
                .then(
                    function (response) {
                        console.log('Subtract successfully');
                        self.successMessage = response.data.successMessage;
                    	self.errorMessage='';
                        self.done = true;
                        self.calc={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while Subtraction');
                        self.errorMessage = 'Error while Subtraction: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }
        
/*-----------------------------------------Multiplication--------------------------------*/
        
        function calcMultiplication(calc) {
            console.log('About to Multiplication');
            CalculationService.calcMultiplication(calc)
                .then(
                    function (response) {
                        console.log('Multiplication successfully');
                        self.successMessage = response.data.successMessage;
                    	self.errorMessage='';
                        self.done = true;
                        self.calc={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while Multiplication');
                        self.errorMessage = 'Error while Multiplication: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }
        
        
    }


    ]);