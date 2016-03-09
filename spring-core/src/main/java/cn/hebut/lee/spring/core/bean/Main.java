package cn.hebut.lee.spring.core.bean;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Main {

	public static void main(String[] args) {
		DefaultListableBeanFactory fac = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(fac);
		reader.loadBeanDefinitions("knights.xml");
		Knight knight = (Knight) fac.getBean("braveKnight");
		knight.embarkOnQuest();

	}

}
