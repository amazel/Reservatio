package mx.com.reservatio.domain;

import static javax.persistence.GenerationType.AUTO;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="reserva")
public class Reserva {
	
	private Integer idReserva;
	private Usuario idUsuario;
	private Consultorio idConsultorio;
	private TarifaCategoria idTarifa;
	private Date fechaInicial;
	private Date fechaFinal;
	private String estado;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id_reserva")
	public Integer getIdReserva() {
		return idReserva;
	}
	
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@ManyToOne
	@JoinColumn(name="id_consultorio")
	public Consultorio getIdConsultorio() {
		return idConsultorio;
	}
	public void setIdConsultorio(Consultorio idConsultorio) {
		this.idConsultorio = idConsultorio;
	}
	
	@ManyToOne
	@JoinColumn(name="id_tarifa")
	public TarifaCategoria getIdTarifa() {
		return idTarifa;
	}
	
	public void setIdTarifa(TarifaCategoria idTarifa) {
		this.idTarifa = idTarifa;
	}
	
	@Column(name="fecha_inicial")
	public Date getFechaInicial() {
		return fechaInicial;
	}
	
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	
	@Column(name="fecha_final")
	public Date getFechaFinal() {
		return fechaFinal;
	}
	
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	@Column(name="estado")
	@Size(min=0, max=50)
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
}
