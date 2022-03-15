package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "detalle_venta")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_deta_venta")
	@SequenceGenerator(name ="seq_deta_venta",sequenceName="seq_deta_venta",allocationSize = 1)
	@Column(name = "deve_id")
	private Integer id;
	
	@Column(name = "deve_cantidad")
	private Integer cantidad;
	
	@Column(name = "deve_prec_unit")
	private BigDecimal precioUnitario;
	
	@Column(name = "deve_subtotal")
	private BigDecimal subtotal;
	
	@OneToOne
	@JoinColumn(name = "venta_id")
	private Venta venta;
	
	@OneToMany(mappedBy = "detalleVenta",cascade = CascadeType.ALL)
	private List<Producto> producto;
	
//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}



	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + ", venta=" + venta + ", producto=" + producto + "]";
	}
	
	
	
	
	
}
