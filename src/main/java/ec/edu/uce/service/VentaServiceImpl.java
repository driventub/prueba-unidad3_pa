package ec.edu.uce.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.Venta;
import ec.edu.uce.modelo.Venta;
import ec.edu.uce.repository.IVentaRepo;

@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	private IVentaRepo guardiaRepo;
	
	
	@Override
	public void insertarVenta(Venta p) {
		this.guardiaRepo.insertarVenta(p);
		
	}

	@Override
	public Venta buscarVenta(Integer id) {
		return this.guardiaRepo.buscarVenta(id);
	}

	@Override
	public void actualizarVentaPorId(Venta p) {
		this.guardiaRepo.actualizarVentaPorId(p);
		
	}

	@Override
	public void borrarVentaPorId(Integer id) {
		this.guardiaRepo.borrarVentaPorId(id);
		
	}
}	