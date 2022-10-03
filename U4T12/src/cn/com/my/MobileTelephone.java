package cn.com.my;

public class MobileTelephone {
	SIMable one;
	SIMable two;
	SIMable three;
	public MobileTelephone() {
		System.out.println("该手机不可安装手机卡");
	}
	public MobileTelephone(SIMable a) {
		System.out.println("该手机为单卡手机");
		a.setNumber("13423413576");
		one=a;
		showMess(one);
	}
	public MobileTelephone(SIMable a,SIMable b){
		System.out.println("该手机为双卡手机");
		two=a;
		three=b;
		showMess(two,three);
	}
	public void useSIM(SIMable card) {
		System.out.println("将"+one.giveCorpName()+"手机卡更换为"+card.giveCorpName()+"手机卡");
		card.setNumber("15323578911");
		one=card;
		showMess(one);
	}
	public void useSIM(SIMable card1,SIMable card2) {
		System.out.println("将"+two.giveCorpName()+"手机卡更换为"+card1.giveCorpName()+"手机卡");
		System.out.println("将"+three.giveCorpName()+"手机卡更换为"+card2.giveCorpName()+"手机卡");
		card1.setNumber("15323578911");
		card2.setNumber("15675423445");
		two=card1;
		three=card2;
		showMess(two,three);
	}
	public void showMess(SIMable card) {
		System.out.println("该手机卡为"+card.giveCorpName());
		System.out.println("该手机卡号为"+card.giveNumber());
	}
	public void showMess(SIMable card1,SIMable card2){
		System.out.println("该手机卡1为"+card1.giveCorpName());
		System.out.println("该手机卡号1为"+card1.giveNumber());
		System.out.println("该手机卡2为"+card2.giveCorpName());
		System.out.println("该手机卡号2为"+card2.giveNumber());
	}
}
