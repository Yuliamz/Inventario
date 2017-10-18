/* global adminInventario, module */

'use strict';
var tipoP = 0;
var grupoP = 0;
module.controller('FacturaVentaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = [];
        $scope.datosFormulario = {};
        $scope.panelEditar = true;
        $scope.selTipo = true;
        $scope.listaDetalle = [];
        $scope.detalle = {};
        $scope.tarifa = {};
        $scope.producto = {};
        $scope.subtotal = 0;
        $scope.iva = 0;
        $scope.total = 0;




        $scope.listar = function () {
            $http.get('./webresources/Producto', {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                        console.log($scope.lista);
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

        $scope.mostrarTipo = function () {
            if ($scope.datosFormulario.grupoProducto !== null) {
                grupoP = $scope.datosFormulario.grupoProducto;
                console.log(grupoP);
                $scope.selTipo = false;
            } else {
                grupoP = 0;
                $scope.selTipo = true;

            }
        };

        $scope.mostrarProductos = function () {
            tipoP = ($scope.datosFormulario.tipoProducto !== null) ? $scope.datosFormulario.tipoProducto : 0;
        };

        $scope.listarGrupoProducto = function () {
            $http.get('./webresources/GrupoProducto', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaGrupoProducto = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de grupoProducto, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarGrupoProducto();

        $scope.listarTipoProducto = function () {
            $http.get('./webresources/TipoProducto', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaTipoProducto = data;
                        console.log($scope.listaTipoProducto);
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de tipoProducto, por favor intente m\xe1s tarde');
            });
        };

        $scope.listarTipoProducto();

// $scope.listarTipoProducto=function(){
//    console.log($scope.datosFormulario.grupoProducto.id);
//            $http.get('./webresources/TipoProducto/grupo/'+$scope.datosFormulario.grupoProducto.id, {})
//                .success(function (data, status, headers, config) {
//                    $scope.listaTipoProducto = data;
//                }).error(function (data, status, headers, config) {
//                    alert('Error al consultar la informaci\xf3n de tipoProducto, por favor intente m\xe1s tarde');
//            });
//            $Scope.selTipo=true;    
//        };



        $scope.listarTarifa = function () {
            $http.get('./webresources/Tarifa', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaTarifa = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de tarifa, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarTarifa();
        $scope.listarUnidadMedida = function () {
            $http.get('./webresources/UnidadMedida', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaUnidadMedida = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de unidadMedida, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarUnidadMedida();
        $scope.listarTienda = function () {
            $http.get('./webresources/Tienda', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaTienda = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de tienda, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarTienda();
        $scope.listarMarca = function () {
            $http.get('./webresources/Marca', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaMarca = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de marca, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarMarca();


        $scope.listarPersona = function () {
            $http.get('./webresources/Persona', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaPersona = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de persona, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarPersona();


        $scope.filtroPorGrupo = function () {
            return function (item) {
                return item.grupoProducto.id === grupoP.id;
            };
        };





        $scope.listar();

        /* va a agregar un producto a la factura
         * 
         */
        $scope.agregar = function (row) {

            $http.get('./webresources/Tarifa/producto/' + row.id, {})
                    .success(function (data, status, headers, config) {
                        $scope.listaDetalle.push({producto: row, cantidad: 1, iva: data.iva, precioUnidad: data.valor});
                        $scope.recalcularSaldo();
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de persona, por favor intente m\xe1s tarde');
            });


            console.log("Vamos a agregar el producto: " + row.nombre);
        };

        $scope.total = function (row) {

            $http.get('./webresources/Tarifa/producto/' + row.id, {})
                    .success(function (data, status, headers, config) {
                        $scope.total.push({producto: row, cantidad: 1, iva: data.iva, precioUnidad: data.valor});
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de persona, por favor intente m\xe1s tarde');
            });


            console.log("Vamos a agregar el producto: " + row.nombre);
        };







        $scope.calcular = function (row) {
            console.log("para calcular totales");
        };


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
        $scope.eliminar = function (data) {
            var index = $scope.listaDetalle.indexOf(data);
                if (index > -1) {
                    $scope.listaDetalle.splice(index, 1);
                }
                $scope.recalcularSaldo();
        };
        
        $scope.limpiar = function () {
            $scope.listaDetalle = [];
            $scope.recalcularSaldo();
        };

        $scope.recalcularSaldo = function () {
            $scope.subtotal = 0;
            $scope.iva = 0;
            $scope.total = 0;
            for (var i = 0; i < $scope.listaDetalle.length; i++) {
                $scope.subtotal += $scope.listaDetalle[i].precioUnidad * $scope.listaDetalle[i].cantidad;
                $scope.iva += $scope.listaDetalle[i].precioUnidad * $scope.listaDetalle[i].cantidad * $scope.listaDetalle[i].iva / 100;
            }
            $scope.total = $scope.subtotal + $scope.iva;
        };
        
         $scope.listarCredito = function () {
            $http.get('./webresources/OpcionesCredito', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaCredito = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarCredito();
        
    }]);

module.filter('tipo', function () {
    return function (items) {
        var filtered = [];
        
        if (!tipoP){
            return items;
        }
        for (var i = 0; i < items.length; i++) {
            
            if (items[i].tipoProducto.id === tipoP.id)
                filtered.push(items[i]);
        }
        return filtered;
    };
});
    