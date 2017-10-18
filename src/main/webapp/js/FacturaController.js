'use strict';

module.controller('FacturaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Factura', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarDetalleFactura=function(){
            $http.get('./webresources/DetalleFactura', {})
                .success(function (data, status, headers, config) {
                    $scope.listaDetalleFactura = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de detalleFactura, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarDetalleFactura();
            $scope.listarTipoPago=function(){
            $http.get('./webresources/TipoPago', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTipoPago = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tipoPago, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTipoPago();
            $scope.listarPersona=function(){
            $http.get('./webresources/Persona', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPersona = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de persona, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPersona();
        

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Factura', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            $http.delete('./webresources/Factura/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Factura, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
