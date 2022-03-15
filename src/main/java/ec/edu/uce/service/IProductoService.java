package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.ConsultarStock;
import ec.edu.uce.modelo.Producto;

public interface IProductoService {

	void insertarProducto(Producto p);

	Producto buscarProducto(Integer id);

	void actualizarProductoPorId(Producto p);

	void borrarProductoPorId(Integer id);
	
	Producto buscarCodigoBarras(String codigoBarras);
	
	List<ConsultarStock> buscarStock(String codigoBarras); 
}