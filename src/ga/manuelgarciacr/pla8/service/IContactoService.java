package ga.manuelgarciacr.pla8.service;

import java.util.List;
import ga.manuelgarciacr.pla8.entity.Contacto;

public interface IContactoService {
	List<Contacto> getContactos();

	void save(Contacto contacto);

	Contacto getContacto(int idcontacto);

	void delete(Contacto contacto);
}