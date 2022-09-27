package com.sopra.pds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Demopds {
	@RequestMapping("/details")
	public String home()
	{
		return "index";
	}
}
