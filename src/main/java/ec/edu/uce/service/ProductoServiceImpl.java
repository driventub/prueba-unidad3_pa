package ec.edu.uce.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.ConsultarStock;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepo guardiaRepo;
	
	
	@Override
	public void insertarProducto(Producto p) {
		this.guardiaRepo.insertarProducto(p);
		
	}

	@Override
	public Producto buscarProducto(Integer id) {
		return this.guardiaRepo.buscarProducto(id);
	}

	@Override
	public void actualizarProductoPorId(Producto p) {
		this.guardiaRepo.actualizarProductoPorId(p);
		
	}

	@Override
	public void borrarProductoPorId(Integer id) {
		this.guardiaRepo.borrarProductoPorId(id);
		
	}

	@Override
	public Producto buscarCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarCodigoBarras(codigoBarras);
	}

	@Override
	public List<ConsultarStock> buscarStock(String codigoBarras) {
		
		return this.guardiaRepo.buscarStock(codigoBarras);
	}
}	