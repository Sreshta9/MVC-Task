package com.sopra.pds;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	@Controller
	public class DemoSopra {
		@RequestMapping("/about")
		public String home()
		{
			return "sopra";
		}
}
