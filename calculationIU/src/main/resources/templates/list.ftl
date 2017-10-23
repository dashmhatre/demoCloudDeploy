<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Simple Calculation </span></div>
		<div class="panel-body">
	        <div class="formcontainer" ng-controller="CalculationController as ctrl">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert" ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	               
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="firstValue">First Value</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.calc.firstValue" id="firstValue" class="username form-control input-sm" placeholder="Enter First Value" required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                </div>
	                
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="secondValue">Second Value</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.calc.secondValue" id="secondValue" class="form-control input-sm" placeholder="Enter Second Value." required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                </div>

	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="operation">Operation</label>
	                        <div class="col-md-7">
	                            <!--<input type="text" ng-model="ctrl.user.age" id="operation" class="form-control input-sm" placeholder="Enter your Age." required ng-pattern="ctrl.onlyIntegers"/>-->
	                            
	                            <select name="singleSelect" ng-model="ctrl.calc.operation">
	                              <option value="">---Please select---</option> 	
							      <option value="addition">Addition</option>
							      <option value="subtraction">Subtraction</option>
							      <option value="multiplication">Multiplication</option>
							    </select>
	                        </div>
	                    </div>
	                </div>
	
	                

	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="Submit" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                        <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>
    