package mx.com.reservatio.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="reserva_complemento")
public class ReservaComplemento {
	
	private Reserva idReserva;
	private Complemento idComplemento;
	
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
