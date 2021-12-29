package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// indentifica al componente para el component-scanning
// spring component-scanning automáticamente lo "descubre" y crea una instancia de esta clase como bean en el SAC 
@Controller 
public class HomeController {

	// Si llega un request con el método GET, para el root-path, entonces éste método debería manejar el request.
	@GetMapping("/") 
	public String home() {
		return "home";
	}
	
}
