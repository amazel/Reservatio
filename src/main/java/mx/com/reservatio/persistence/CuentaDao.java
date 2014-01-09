package mx.com.reservatio.persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.reservatio.domain.Usuario;
import mx.com.reservatio.persistence.inter.ICuentaDao;

@Repository
public class CuentaDao implements ICuentaDao {
	
	private SessionFactory sessionFactory;
	
	public CuentaDao() {}
	
	@Autowired
	public CuentaDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void crearUsuario(Usuario usuario) {
		getCurrentSession().save(usuario);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		getCurrentSession().update(usuario);

	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		getCurrentSession().delete(usuario);
	}

	@Override
	public Usuario consultaUsuarioPorId(Integer id) {		
		Criteria c = getCurrentSession().createCriteria(Usuario.class);
		c.add(Restrictions.eq("idUsuario", id));
		return (Usuario)c.uniqueResult();
	}

	@Override
	public List<Usuario> consultaUsuarioPorNombreCompleto(String nombre,
			String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> consultaTodosUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
