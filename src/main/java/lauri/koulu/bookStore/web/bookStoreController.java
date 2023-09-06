package lauri.koulu.bookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bookStoreController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}

}
