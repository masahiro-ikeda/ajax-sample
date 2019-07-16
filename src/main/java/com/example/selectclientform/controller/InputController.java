package com.example.selectclientform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputController {

	@RequestMapping("input")
	public String showCreateFrom() {

		return "client-form";
	}
}
