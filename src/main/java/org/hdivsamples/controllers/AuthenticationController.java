package org.hdivsamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {

	@RequestMapping("/login")
	public String login(final Model model) {
		return "login";
	}

	@RequestMapping("/")
	public String home(final Model model) {
		return "redirect:/dashboard";
	}

	@RequestMapping("/403")
	public String error403(final Model model) {
		// demo dead code
		int num = 5;
		if (num < 10) {
			return "error403";
		}else {
			System.out.println("demo dead code");
		}
		return "error403";
	}
}

