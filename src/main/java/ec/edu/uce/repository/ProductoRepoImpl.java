package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.ConsultarStock;
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
	
	// Poner mandatory despues
	@Override
	public void actualizarProductoPorId(Producto p) {
		this.entityManager.merge(p);

	}

	@Override
	public void borrarProductoPorId(Integer id) {
		Producto gBorrar = this.buscarProducto(id);
		this.entityManager.remove(gBorrar);

	}

	@Override
	public Producto buscarCodigoBarras(String codigoBarras) {
		TypedQuery<Producto> myTypedQuery = (TypedQuery<Producto>) this.entityManager

				.createQuery("SELECT f FROM Producto f  WHERE f.codigoBarras =:valor ",Producto.class);
		myTypedQuery.setParameter("valor", codigoBarras);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public List<ConsultarStock> buscarStock(String codigoBarras) {
		TypedQuery<ConsultarStock> myTypedQuery = (TypedQuery<ConsultarStock>) this.entityManager
				
				.createQuery("SELECT NEW  ec.edu.uce.modelo.ConsultarStock(f.codigoBarras, f.nombre, f.stock) FROM Producto f WHERE f.codigoBarras =:valor",ConsultarStock.class);
		myTypedQuery.setParameter("valor", codigoBarras);
		
		return myTypedQuery.getResultList();
	}

}