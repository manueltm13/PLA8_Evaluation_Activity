package ga.manuelgarciacr.pla8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ga.manuelgarciacr.pla8.dao.ITareaDAO;
import ga.manuelgarciacr.pla8.entity.Tarea;
import ga.manuelgarciacr.pla8.service.ITareaService;

@Controller
@RequestMapping("/tarea")
public class TareaController {
	@Autowired
	private ITareaService tareaService;

	@RequestMapping("/lista")
	public String lista(Model modelo) {
		List<Tarea> tareas = tareaService.getTareas();
		modelo.addAttribute("tareas", tareas);
		return "lista-tareas";
	}
}
