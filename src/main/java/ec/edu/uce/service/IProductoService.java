package ec.edu.uce.service;

import ec.edu.uce.modelo.Producto;

public interface IProductoService {

	void insertarProducto(Producto p);

	Producto buscarProducto(Integer id);

	void actualizarProductoPorId(Producto p);

	void borrarProductoPorId(Integer id);
}