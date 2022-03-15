package ec.edu.uce.service;

import ec.edu.uce.modelo.DetalleVenta;

public interface IDetalleVentaService {

	void insertarDetalleVenta(DetalleVenta p);

	DetalleVenta buscarDetalleVenta(Integer id);

	void actualizarDetalleVentaPorId(DetalleVenta p);

	void borrarDetalleVentaPorId(Integer id);
}