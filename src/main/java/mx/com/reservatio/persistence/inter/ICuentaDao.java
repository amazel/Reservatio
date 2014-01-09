package mx.com.reservatio.persistence.inter;

import java.util.List;

import mx.com.reservatio.domain.Usuario;

public interface ICuentaDao {
	
	void crearUsuario(Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	void eliminarUsuario(Usuario usuario);
	Usuario consultaUsuarioPorId(Integer id);
	List<Usuario> consultaUsuarioPorNombreCompleto(String nombre, String apellido);
	List<Usuario> consultaTodosUsuarios();

}
