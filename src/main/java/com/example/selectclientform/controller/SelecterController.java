package com.example.selectclientform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.selectclientform.dto.ClientDto;
import com.example.selectclientform.mapper.ClientMapper;
import com.google.gson.Gson;

/*
 * ajaxを使った非同期のリクエストを受け取るRestControllerクラスです。
 * http通信でhtmlファイル以外のデータを扱う場合はRestControllerを使います。
 */
@RestController
public class SelecterController {

	@Autowired
	ClientMapper mapper;

	/*
	 * DBから取得した値をjson形式にして返却します。
	 * https://ja.wikipedia.org/wiki/JavaScript_Object_Notation
	 */
	@RequestMapping("selecter")
	public String showCreateFrom(@RequestParam(name = "client", required = false) String client) {

		Map<String, String> map = new HashMap<>();
		map.put("client", client);
		List<ClientDto> list = mapper.getSelectList(map);

		// Gsonというライブラリを使ってJavaのオブジェクトをjson形式に変換します。
		Gson gson = new Gson();
		return gson.toJson(list);
	}
}
