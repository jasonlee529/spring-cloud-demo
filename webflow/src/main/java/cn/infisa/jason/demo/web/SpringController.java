package cn.infisa.jason.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/spring/")
public class SpringController {
	
	@RequestMapping
	public String execute(){
		return "index";
	}
}
