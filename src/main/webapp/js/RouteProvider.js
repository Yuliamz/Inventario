'use strict';


// Declare app level module which depends on filters, and services
var app=angular.module('adminInventario', [
  'ngRoute',
  'angularUtils.directives.dirPagination',
  'adminInventario.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {templateUrl: 'partials/menu.html'});
	$routeProvider.when('/UnidadMedida', {templateUrl: 'partials/UnidadMedida.html', controller: 'UnidadMedidaCtrl'});
	$routeProvider.when('/DetalleFactura', {templateUrl: 'partials/DetalleFactura.html', controller: 'DetalleFacturaCtrl'});
	$routeProvider.when('/InventarioDetalle', {templateUrl: 'partials/InventarioDetalle.html', controller: 'InventarioDetalleCtrl'});
	$routeProvider.when('/OpcionesCredito', {templateUrl: 'partials/OpcionesCredito.html', controller: 'OpcionesCreditoCtrl'});
	$routeProvider.when('/Factura', {templateUrl: 'partials/Factura.html', controller: 'FacturaCtrl'});
	$routeProvider.when('/Tienda', {templateUrl: 'partials/Tienda.html', controller: 'TiendaCtrl'});
	$routeProvider.when('/TipoProducto', {templateUrl: 'partials/TipoProducto.html', controller: 'TipoProductoCtrl'});
	$routeProvider.when('/Producto', {templateUrl: 'partials/Producto.html', controller: 'ProductoCtrl'});
	$routeProvider.when('/Persona', {templateUrl: 'partials/Persona.html', controller: 'PersonaCtrl'});
	$routeProvider.when('/TipoPago', {templateUrl: 'partials/TipoPago.html', controller: 'TipoPagoCtrl'});
	$routeProvider.when('/Tarifa', {templateUrl: 'partials/Tarifa.html', controller: 'TarifaCtrl'});
	$routeProvider.when('/Inventario', {templateUrl: 'partials/Inventario.html', controller: 'InventarioCtrl'});
	$routeProvider.when('/Marca', {templateUrl: 'partials/Marca.html', controller: 'MarcaCtrl'});
	$routeProvider.when('/GrupoProducto', {templateUrl: 'partials/GrupoProducto.html', controller: 'GrupoProductoCtrl'});
	$routeProvider.when('/FacturaVenta', {templateUrl: 'partials/FacturaVenta.html', controller: 'FacturaVentaCtrl'});
	
  	$routeProvider.otherwise({redirectTo: '/'}); 
}]);

var module=angular.module("adminInventario.controllers",[]);
