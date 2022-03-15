package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.ConsultarStock;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.ReporteVenta;

public interface IGestorService {
	void realizarVenta(String codigoBarras, Integer cantidad, String cedulaCliente, String numVenta);
	void consultarStock(String codigoBarras);
	void reporteVentas(LocalDateTime fechaVenta, String categoriaP, Integer cantidad);
	void ingresarProducto(Producto p);
	
}
