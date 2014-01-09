package mx.com.reservatio.domain;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "complemento")
public class Complemento {
	private Integer idComplemento;
	private String nombre;
	private String descripcion;
	private String status;
	private Categoria idCategoria;

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id_complemento")
	public Integer getIdComplemento() {
		return idComplemento;
	}

	public void setIdComplemento(Integer idComplemento) {
		this.idComplemento = idComplemento;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

}
