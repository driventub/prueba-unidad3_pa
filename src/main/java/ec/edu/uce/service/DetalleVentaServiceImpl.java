package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.DetalleVenta;
import ec.edu.uce.repository.IDetalleVentaRepo;


@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{
	
	@Autowired
	private IDetalleVentaRepo guardiaRepo;
	
	
	@Override
	public void insertarDetalleVenta(DetalleVenta p) {
		this.guardiaRepo.insertarDetalleVenta(p);
		
	}

	@Override
	public DetalleVenta buscarDetalleVenta(Integer id) {
		return this.guardiaRepo.buscarDetalleVenta(id);
	}

	@Override
	public void actualizarDetalleVentaPorId(DetalleVenta p) {
		this.guardiaRepo.actualizarDetalleVentaPorId(p);
		
	}

	@Override
	public void borrarDetalleVentaPorId(Integer id) {
		this.guardiaRepo.borrarDetalleVentaPorId(id);
		
	}
}	
