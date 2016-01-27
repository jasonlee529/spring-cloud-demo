package cn.infisa.jason.demo.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/spring")
public class SpringController {
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	@RequestMapping
	public String execute(){
		logger.info(" execute index ");
		return "index";
	}
	
	@RequestMapping(value="shopping.do")
	public String shopping(){
		logger.info(" spring mvc handle url mapping ");
		return "index";
	}
}
