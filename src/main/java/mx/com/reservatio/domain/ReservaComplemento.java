package mx.com.reservatio.domain;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="reserva_complemento")
public class ReservaComplemento {
	
	private Integer idReservaComplemento;
	private Reserva idReserva;
	private Complemento idComplemento;
	
	
	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id_reserva_complemento")
	public Integer getIdReservaComplemento() {
		return idReservaComplemento;
	}

	public void setIdReservaComplemento(Integer idReservaComplemento) {
		this.idReservaComplemento = idReservaComplemento;
	}

	@ManyToOne
	@JoinColumn(name="id_reserva")
	public Reserva getIdReserva() {
		return idReserva;
	}
	
	public void setIdReserva(Reserva idReserva) {
		this.idReserva = idReserva;
	}
	
	@ManyToOne
	@JoinColumn(name="id_complemento")
	public Complemento getIdComplemento() {
		return idComplemento;
	}
	
	public void setIdComplemento(Complemento idComplemento) {
		this.idComplemento = idComplemento;
	}
	
	

}
