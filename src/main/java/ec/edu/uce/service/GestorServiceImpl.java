package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.ConsultarStock;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.ReporteVenta;
import ec.edu.uce.modelo.Venta;



@Service
public class GestorServiceImpl implements IGestorService {
	
	private static final Logger LOG = LogManager.getLogger(GestorServiceImpl.class);
	
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IVentaService ventaService;
	@Autowired
	private IDetalleVentaService detalleService;
	
	
	
	
	@Override
	@Transactional
	public void realizarVenta(String codigoBarras, Integer cantidad, String cedulaCliente, String numVenta) {
		Producto p = this.productoService.buscarCodigoBarras(codigoBarras);
		
//		Mejor seria try-catch
		if(p.getStock() < cantidad) {
			LOG.info("Transaccion reversada");
			throw new NullPointerException();
			
		}else {
			Integer r = p.getStock() - cantidad;
			p.setStock(r);
			this.productoService.actualizarProductoPorId(p);
			
			Venta venta = new Venta();
			venta.setNumero(numVenta);
			venta.setCedulaCliente(cedulaCliente);
			
			this.ventaService.insertarVenta(venta);
			
		}
		
		
		
	}

	@Override
	@Transactional
	public void ingresarProducto(Producto p) {
		String codigoBarras = p.getCodigoBarras();
		Producto p2 = this.productoService.buscarCodigoBarras(codigoBarras);
//		Significa que ya existe el producto
		if(p2.getCodigoBarras() != null) {
			Integer r = p.getStock() + (p2.getStock());
			p2.setStock(r);
			this.productoService.actualizarProductoPorId(p2);
//		Vendria bien un try catch aqui, quizas salga un nullpointerexception
		}else {
			this.productoService.insertarProducto(p);
		}
		
		
	}

	@Override
	public void consultarStock(String codigoBarras) {
		List<ConsultarStock> c = this.productoService.buscarStock(codigoBarras);
		
		Stream<ConsultarStock> listaCambiada = c.stream();
		listaCambiada.forEach(p -> LOG.info(p.toString()));
		
	}

	@Override
	public void reporteVentas(LocalDateTime fechaVenta, String categoriaP, Integer cantidad) {
		// TODO Auto-generated method stub
		
	}

	
}
