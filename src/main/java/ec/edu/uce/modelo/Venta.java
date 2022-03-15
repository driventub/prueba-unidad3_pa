package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_venta")
	@SequenceGenerator(name ="seq_venta",sequenceName="seq_venta",allocationSize = 1)
	@Column(name = "vent_id")
	private Integer id;
	
	@Column(name = "vent_numero")
	private String numero;
	
	@Column(name = "vent_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "vent_cedula")
	private String cedulaCliente;
	
	@Column(name = "vent_total")
	private BigDecimal totalVenta;
	
	@OneToOne(mappedBy = "venta",cascade = CascadeType.ALL)
	private DetalleVenta detalleVenta;

//	Set y Get
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}

	

	


	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(DetalleVenta detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedulaCliente=" + cedulaCliente
				+ ", totalVenta=" + totalVenta  + "]";
	}
	
	
}

