package ec.edu.uce.service;

import ec.edu.uce.modelo.Producto;

public interface IGestorService {
	void realizarVenta(String codigoBarras, Integer cantidad, String cedulaCliente, String numVenta);
	void insertarProducto(Producto p);
	
}
