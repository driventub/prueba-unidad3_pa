package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.ReporteVenta;
import ec.edu.uce.modelo.Venta;

public interface IVentaRepo {

	void insertarVenta(Venta p);

	Venta buscarVenta(Integer id);

	void actualizarVentaPorId(Venta p);

	void borrarVentaPorId(Integer id);
	
	List<ReporteVenta> buscarReporteVenta(String codigoBarras, String nombre, Integer stock);
	
}
