package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSARestController {
	
	@GetMapping("ssn-number/{ssa}")
	public String getSSN(@PathVariable String ssa) {
		
		String ssn = ssa;

		if (ssn.startsWith("5")) {

			return "Kentucky";

		}

		else if (ssn.startsWith("4")) {

			return "Maxico";
		}

		else if (ssn.startsWith("3")) {

			return "yenker";
		}

		else if (ssn.startsWith("2")) {

			return "washington";

		} else if (ssn.startsWith("")) {

			return "Texas";
		}

		else {

			return "You have  enter Invalid State Name";
		}
		
		
	
		

	}
}
