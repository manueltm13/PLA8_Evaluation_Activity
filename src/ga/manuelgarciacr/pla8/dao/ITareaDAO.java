package ga.manuelgarciacr.pla8.dao;

import java.util.List;
import ga.manuelgarciacr.pla8.entity.Tarea;

public interface ITareaDAO {
	List<Tarea> getTareas();

	void save(Tarea tarea);
}