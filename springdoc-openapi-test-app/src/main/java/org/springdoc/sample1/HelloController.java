package org.springdoc.sample1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello/{numTelco}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	@Tag(name = "tea")
	public String index(@PathVariable("numTelco") String numTel, String adresse) {
		return "Greetings from Spring Boot!";
	}

}