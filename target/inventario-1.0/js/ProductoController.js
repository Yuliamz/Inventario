'use strict';

module.controller('ProductoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Producto', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarTipoProducto=function(){
            $http.get('./webresources/TipoProducto', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTipoProducto = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tipoProducto, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTipoProducto();
            $scope.listarTarifa=function(){
            $http.get('./webresources/Tarifa', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTarifa = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tarifa, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTarifa();
            $scope.listarUnidadMedida=function(){
            $http.get('./webresources/UnidadMedida', {})
                .success(function (data, status, headers, config) {
                    $scope.listaUnidadMedida = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de unidadMedida, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarUnidadMedida();
            $scope.listarTienda=function(){
            $http.get('./webresources/Tienda', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTienda = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tienda, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTienda();
            $scope.listarMarca=function(){
            $http.get('./webresources/Marca', {})
                .success(function (data, status, headers, config) {
                    $scope.listaMarca = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de marca, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarMarca();
        

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
        $http.post('./webresources/Producto', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/Producto/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Producto, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
