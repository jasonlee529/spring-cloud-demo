package cn.hebut.lee.spring.core.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("knights.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Knight knight = (Knight)factory.getBean("braveKnight");
		knight.embarkOnQuest();
	}

}
