package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.ReporteVenta;
import ec.edu.uce.modelo.Venta;

@Repository
@Transactional
public class VentaRepoImpl implements IVentaRepo {

	private static final Logger LOG = LogManager.getLogger(VentaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarVenta(Venta p) {
		this.entityManager.persist(p);

	}

	@Override
	public Venta buscarVenta(Integer id) {
		return this.entityManager.find(Venta.class, id);

	}

	@Override
	public void actualizarVentaPorId(Venta p) {
		this.entityManager.merge(p);

	}

	@Override
	public void borrarVentaPorId(Integer id) {
		Venta gBorrar = this.buscarVenta(id);
		this.entityManager.remove(gBorrar);

	}

	@Override
	public List<ReporteVenta> buscarReporteVenta(String codigoBarras, String nombre, Integer stock) {
		// TODO Auto-generated method stub
		return null;
	}

}
