package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.Producto;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo {

	private static final Logger LOG = LogManager.getLogger(ProductoRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarProducto(Producto p) {
		this.entityManager.persist(p);

	}

	@Override
	public Producto buscarProducto(Integer id) {
		return this.entityManager.find(Producto.class, id);

	}

	@Override
	public void actualizarProductoPorId(Producto p) {
		this.entityManager.merge(p);

	}

	@Override
	public void borrarProductoPorId(Integer id) {
		Producto gBorrar = this.buscarProducto(id);
		this.entityManager.remove(gBorrar);

	}

}