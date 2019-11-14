package ga.manuelgarciacr.pla8.service;

import java.util.List;
import ga.manuelgarciacr.pla8.entity.Tarea;

public interface ITareaService {
	List<Tarea> getTareas();

	void save(Tarea tarea);
}