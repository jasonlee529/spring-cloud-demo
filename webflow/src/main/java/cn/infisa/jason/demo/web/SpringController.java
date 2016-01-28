package cn.infisa.jason.demo.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="{id}")
	public String shopping(@PathVariable(value="id")String id){
		logger.info(" spring mvc handle url mapping "+id);
		return "index";
	}
}
