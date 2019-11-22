package ga.manuelgarciacr.pla8.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ga.manuelgarciacr.pla8.entity.Contacto;
import ga.manuelgarciacr.pla8.service.IContactoService;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
	@Autowired
	private IContactoService contactoService;

	@RequestMapping("/lista")
	public String lista(Model modelo) {
		List<Contacto> contactos = contactoService.getContactos();
		modelo.addAttribute("contactos", contactos);
		return "lista-contactos";
	}

	@GetMapping("/addcontacto")
	public String addcontacto(Model modelo) {
		Contacto contacto = new Contacto();
		modelo.addAttribute("contacto", contacto);
		return "form-contacto";
	}

	/*
	@PostMapping("/savecontacto")
	public String saveContacto(@ModelAttribute("contacto") Contacto contacto) {
		contactoService.save(contacto);
		return "redirect:/contacto/lista";
	}
	*/
	
	@PostMapping("/savecontacto")
	public String procesarForm(@Valid @ModelAttribute("contacto") Contacto contacto, 
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form-contacto";
		} else {
			contactoService.save(contacto);
			return "redirect:/contacto/lista";
		}
	}
	
	@GetMapping("updatecontacto")
	public String updateContacto(@RequestParam("idcontacto") int idcontacto, Model modelo) {
		Contacto contacto = contactoService.getContacto(idcontacto);
		modelo.addAttribute("contacto", contacto);
		return "form-contacto";
	}

	@GetMapping("deletecontacto")
	public String deleteContacto(@RequestParam("idcontacto") int idcontacto) {
		Contacto contacto = contactoService.getContacto(idcontacto);
		contactoService.delete(contacto);
		return "redirect:/contacto/lista";
	}
}
