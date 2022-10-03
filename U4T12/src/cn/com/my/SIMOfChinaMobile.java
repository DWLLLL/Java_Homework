package cn.com.my;

public class SIMOfChinaMobile implements SIMable {
	String number;
	public void setNumber(String number) {
		this.number = number;
	}

	public String giveNumber() {
		return number;
	}

	public String giveCorpName() {
		return "中国移动";
	}

}
