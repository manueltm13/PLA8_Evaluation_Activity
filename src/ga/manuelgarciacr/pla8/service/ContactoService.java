package ga.manuelgarciacr.pla8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ga.manuelgarciacr.pla8.dao.IContactoDAO;
import ga.manuelgarciacr.pla8.entity.Contacto;

@Service
@Transactional
public class ContactoService implements IContactoService {
	@Autowired
	private IContactoDAO contactoDAO;

	@Override
	public List<Contacto> getContactos() {
		return contactoDAO.getContactos();
	}

	@Override
	public void save(Contacto contacto) {
		contactoDAO.save(contacto);
	}

	@Override
	public Contacto getContacto(int idcontacto) {
		return contactoDAO.getContacto(idcontacto);
	}

	@Override
	public void delete(Contacto contacto) {
		contactoDAO.delete(contacto);
	}
}