package ec.edu.uce.modelo;

public class ConsultarStock {
	
	private String codigoBarra;
	private String nombre;
	private Integer stock;
	public ConsultarStock() {
		
	}
	public ConsultarStock(String codigoBarra, String nombre, Integer stock) {
		super();
		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		this.stock = stock;
	}
	
//	Set y Get
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "ConsultarStock [codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", stock=" + stock + "]";
	}
	

	
	
	
	
	
	
}
	