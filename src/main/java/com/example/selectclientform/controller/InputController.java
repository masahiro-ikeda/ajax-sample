package com.example.selectclientform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 画面表示のみを行っています。
 * Ajaxとは無関係です。
 */
@Controller
public class InputController {

	@RequestMapping("input")
	public String showCreateFrom() {

		return "client-form";
	}
}
