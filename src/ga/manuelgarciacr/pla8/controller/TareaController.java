package ga.manuelgarciacr.pla8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/addtarea")
	public String addtarea(Model modelo) {
		Tarea tarea = new Tarea();
		modelo.addAttribute("tarea", tarea);
		return "form-tarea";
	}

	@PostMapping("/savetarea")
	public String saveTarea(@ModelAttribute("tarea") Tarea tarea) {
		tareaService.save(tarea);
		return "redirect:/tarea/lista";
	}

	@GetMapping("updatetarea")
	public String updateTarea(@RequestParam("idtarea") int idtarea, Model modelo) {
		Tarea tarea = tareaService.getTarea(idtarea);
		modelo.addAttribute("tarea", tarea);
		return "form-tarea";
	}

	@GetMapping("deletetarea")
	public String deleteTarea(@RequestParam("idtarea") int idtarea) {
		Tarea tarea = tareaService.getTarea(idtarea);
		tareaService.delete(tarea);
		return "redirect:/tarea/lista";
	}
}
