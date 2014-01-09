package mx.com.reservatio.domain;

import mx.com.reservatio.persistence.inter.ICuentaDao;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Test-ApplicationContext.xml", "classpath:Test-DataSource.xml"})
@TransactionConfiguration(transactionManager = "transactionManager")
@Transactional(propagation=Propagation.REQUIRED)
public class UsuarioUnitTest {
	
	private Usuario nuevoUsuario;
	
	@Autowired
	private ICuentaDao cuentaDAO;
	
	@Before
	public void setup(){
		
		this.nuevoUsuario = new Usuario();
		
		nuevoUsuario.setNombre("Hugo");
		nuevoUsuario.setApellido("Lezama");
		nuevoUsuario.setCelular("44444444");
		nuevoUsuario.setContrasena("pass");
		nuevoUsuario.setTipo("Admin");
		nuevoUsuario.setTelefono("5555555");		
	}
	
	@Test
	public void debeConsultarUsuarioPorId(){
		Usuario u = cuentaDAO.consultaUsuarioPorId(1);
		assertEquals(u.getIdUsuario(),new Integer(1));
	}

}
