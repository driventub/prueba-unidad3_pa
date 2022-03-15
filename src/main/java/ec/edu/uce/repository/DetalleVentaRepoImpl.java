package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.DetalleVenta;

@Repository
@Transactional
public class DetalleVentaRepoImpl implements IDetalleVentaRepo {

	private static final Logger LOG = LogManager.getLogger(DetalleVentaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarDetalleVenta(DetalleVenta p) {
		this.entityManager.persist(p);

	}

	@Override
	public DetalleVenta buscarDetalleVenta(Integer id) {
		return this.entityManager.find(DetalleVenta.class, id);

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizarDetalleVentaPorId(DetalleVenta p) {
		this.entityManager.merge(p);

	}

	@Override
	public void borrarDetalleVentaPorId(Integer id) {
		DetalleVenta gBorrar = this.buscarDetalleVenta(id);
		this.entityManager.remove(gBorrar);

	}

}