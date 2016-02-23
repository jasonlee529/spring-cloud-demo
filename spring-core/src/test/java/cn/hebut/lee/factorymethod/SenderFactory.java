package cn.hebut.lee.factorymethod;

public class SenderFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
	
	public static void main(String [] args){
		SenderFactory factory = new SenderFactory();
		Sender s1 = factory.produce("mail");
		s1.send();
		s1 = factory.produce("sms");
		s1.send();
		s1 = factory.produce("mail-sms");
		s1.send();
	}
}
