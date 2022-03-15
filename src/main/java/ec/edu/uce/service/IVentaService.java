package ec.edu.uce.service;

import ec.edu.uce.modelo.Venta;

public interface IVentaService {

	void insertarVenta(Venta p);

	Venta buscarVenta(Integer id);

	void actualizarVentaPorId(Venta p);

	void borrarVentaPorId(Integer id);
}