package cn.com.my;

public class SIMOfChinaUnicom implements SIMable {
	String number;

	public void setNumber(String number) {
		this.number=number;
	}

	public String giveNumber() {
		return number;
	}

	public String giveCorpName() {
		return "中国联通";
	}

}
