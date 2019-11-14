package ga.manuelgarciacr.pla8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ga.manuelgarciacr.pla8.dao.ITareaDAO;
import ga.manuelgarciacr.pla8.entity.Tarea;

@Service
@Transactional
public class TareaService implements ITareaService {
	@Autowired
	private ITareaDAO tareaDAO;

	@Override
	public List<Tarea> getTareas() {
		return tareaDAO.getTareas();
	}
}