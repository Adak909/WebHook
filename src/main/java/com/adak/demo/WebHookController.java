package com.adak.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adak/webhook")
public class WebHookController {

	@PostMapping // http://localhost9090/adak/wehbook
	public ResponseEntity<String> print(@RequestBody String requestBody) {
		System.out.println("#######WEBHOOK######" + requestBody);
		return new ResponseEntity<String>(requestBody, HttpStatus.OK);
	}
}
