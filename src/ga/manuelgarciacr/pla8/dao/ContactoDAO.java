package ga.manuelgarciacr.pla8.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ga.manuelgarciacr.pla8.entity.Contacto;

@Repository
public class ContactoDAO implements IContactoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Contacto> getContactos() {
		Session miSesion = sessionFactory.getCurrentSession();
		List<Contacto> tareas = miSesion.createQuery("from Contacto", Contacto.class).list();
		return tareas;
	}

	@Override
	public void save(Contacto contacto) {
		Session miSesion = sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(contacto);	
	}

	@Override
	public Contacto getContacto(int idcontacto) {
		Session miSesion = sessionFactory.getCurrentSession();
		return miSesion.get(Contacto.class,idcontacto);
	}

	@Override
	public void delete(Contacto contacto) {
		Session miSesion = sessionFactory.getCurrentSession();
		miSesion.delete(contacto);	
	}
	
}