package cn.hebut.lee.spring.core.bean;

public class BraveKnight implements Knight{

	public void embarkOnQuest() {
		System.out.println(" BraveKnight before embark!!!");
		quest.embark();
		System.out.println(" BraveKnight after embark!!!");
	}

	private Quest quest;

	public BraveKnight(Quest quest) {
		super();
		this.quest = quest;
		System.out.println(" BraveKnight is ready!!!");
	}
	
	
}
