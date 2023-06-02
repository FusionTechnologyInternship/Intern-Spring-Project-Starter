package Fusion.Internship.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = { "/" })
public class HomeController {
	
	@GetMapping
	public ModelAndView homeView()
	{
		ModelAndView model = new ModelAndView();

		model.setViewName("Home");

		return model;
	}

}
