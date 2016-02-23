package cn.hebut.lee.classload;

public class BeanFactory {

	private final BeanDefinitionReader reader = new BeanDefinitionReader(this);

	public BeanFactory() {
		super();
		System.out.println(" init BeanFactory ");
	}
	public static void main(String [] args){
		BeanFactory factory = new BeanFactory();
	}
	
}
