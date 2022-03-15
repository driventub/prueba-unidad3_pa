package ec.edu.uce;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.service.IGestorService;
import ec.edu.uce.service.IProductoService;

@SpringBootApplication
public class Prueba3Application implements CommandLineRunner{
	
	
	@Autowired
	private IGestorService gestor;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Productos
		Producto p1 = new Producto();
		p1.setCodigoBarras("2389-3243-5678");
		p1.setNombre("Mango");
		p1.setStock(40);
		p1.setCategoria("Comida");
		p1.setPrecio(new BigDecimal("0.5"));
		
		Producto p2 = new Producto();
		p2.setCodigoBarras("4772-3243-5678");
		p2.setNombre("Pan");
		p2.setCategoria("Comida");
		p2.setStock(50);
		p2.setPrecio(new BigDecimal("0.15"));
		
		Producto p3 = new Producto();
		p3.setCodigoBarras("7271-3243-5678");
		p3.setNombre("Huevo");
		p3.setStock(30);
		p3.setCategoria("Comida");
		p3.setPrecio(new BigDecimal("3.90"));
		
//		this.gestor.ingresarProducto(p1);
//		this.gestor.ingresarProducto(p2);
//		this.gestor.ingresarProducto(p3);
//		this.gestor.ingresarProducto(p1);
//		this.gestor.ingresarProducto(p2);
//		this.gestor.ingresarProducto(p3);
		
//		this.gestor.realizarVenta(p1.getCodigoBarras(),2,"123467633-3", "223");
		
		this.gestor.consultarStock(p1.getCodigoBarras());
		
		
		
	}

}
