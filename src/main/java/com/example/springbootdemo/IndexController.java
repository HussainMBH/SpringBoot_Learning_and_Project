package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}

}
