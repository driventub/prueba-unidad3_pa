package ec.edu.uce.repository;

import ec.edu.uce.modelo.DetalleVenta;

public interface IDetalleVentaRepo {

	void insertarDetalleVenta(DetalleVenta p);

	DetalleVenta buscarDetalleVenta(Integer id);

	void actualizarDetalleVentaPorId(DetalleVenta p);

	void borrarDetalleVentaPorId(Integer id);
}
