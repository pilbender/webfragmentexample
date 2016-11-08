package org.raescott;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "app2")
public class App2Controller {
	@RequestMapping(value = "")
	public String get(Model model) {
		return "app2";
	}
}