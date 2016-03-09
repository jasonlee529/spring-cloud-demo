/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.spring.mail.simple;

import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class TemplateMailSender {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("mail.xml");
		JavaMailSender senderImpl = (JavaMailSender) context.getBean("mailSender");
		VelocityEngine velocityEngine = (VelocityEngine) context.getBean("velocityEngine");
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("libo@infisa.cn");
		mailMessage.setFrom("libo@infisa.cn");
		mailMessage.setSubject(" 测试简单文本邮件发送！ ");
		Map<String , Object> model = new HashMap<String , Object>();
		model.put("address", "libo@infisa.cn");
		mailMessage.setText(VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "template/mail.vm", 
				"utf-8", model));
		// 发送邮件
		senderImpl.send(mailMessage);

		System.out.println(" 邮件发送成功.. ");	
	}

}
