package cn.hebut.lee.classload;

public class BeanDefinitionReader {

	
	private BeanFactory beanFactory;

	public BeanDefinitionReader(BeanFactory beanFactory) {
		super();
		this.beanFactory = beanFactory;
		System.out.println( " init BeanDefinitionReader ");
	}
	
}
