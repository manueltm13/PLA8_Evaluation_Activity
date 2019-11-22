package ga.manuelgarciacr.pla8.dao;

import java.util.List;
import ga.manuelgarciacr.pla8.entity.Contacto;

public interface IContactoDAO {
	List<Contacto> getContactos();

	void save(Contacto contacto);

	Contacto getContacto(int idcontacto);

	void delete(Contacto contacto);
}