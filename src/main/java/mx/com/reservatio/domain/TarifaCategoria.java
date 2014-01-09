package mx.com.reservatio.domain;

import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="tarifa_categoria")
public class TarifaCategoria {
	
	private Integer idTarifa;
	private float tarifa;
	private Categoria idCategoria;
	private String descripcion;
	

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id_tarifa")
	public Integer getIdTarifa() {
		return idTarifa;
	}
	
	public void setIdTarifa(Integer idTarifa) {
		this.idTarifa = idTarifa;
	}

	@Column(name="tarifa")
	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}
	

	@ManyToOne
	@JoinColumn(name="id_categoria")
	public Categoria getIdCategoria() {
		return idCategoria;
	}
	

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}
	

	@Column(name="descripcion")
	@Size(min=0, max=200)
	public String getDescripcion() {
		return descripcion;
	}
	

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	

}