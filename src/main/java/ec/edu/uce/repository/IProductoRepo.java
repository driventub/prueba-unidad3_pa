package ec.edu.uce.repository;

import ec.edu.uce.modelo.Producto;

public interface IProductoRepo {

	void insertarProducto(Producto p);

	Producto buscarProducto(Integer id);

	void actualizarProductoPorId(Producto p);

	void borrarProductoPorId(Integer id);
}
