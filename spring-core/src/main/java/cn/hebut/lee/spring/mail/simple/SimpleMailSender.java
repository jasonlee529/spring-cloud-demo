/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.spring.mail.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SimpleMailSender {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("mail.xml");
		JavaMailSender senderImpl = (JavaMailSender) context.getBean("mailSender");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("libo@infisa.cn");
		mailMessage.setFrom("libo@infisa.cn");
		mailMessage.setSubject(" 测试简单文本邮件发送！ ");
		mailMessage.setText(" 测试我的简单邮件发送机制！！ ");

		// 发送邮件
		senderImpl.send(mailMessage);

		System.out.println(" 邮件发送成功.. ");
	}

}
