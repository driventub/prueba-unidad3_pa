package ec.edu.uce.repository;

import ec.edu.uce.modelo.Venta;

public interface IVentaRepo {

	void insertarVenta(Venta p);

	Venta buscarVenta(Integer id);

	void actualizarVentaPorId(Venta p);

	void borrarVentaPorId(Integer id);
}
