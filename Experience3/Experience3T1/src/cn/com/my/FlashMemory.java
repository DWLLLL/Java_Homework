package cn.com.my;

public class FlashMemory implements ComputerCompany,ComputerWeight{
    public double computerWeight() {
        return 2.1;
    }

    public void printName() {
        System.out.println("公司名：联想");
    }

    public double printPrice() {
        return 7000;
    }

    public String computerName() {
        return "拯救者";
    }

    public void printFunction() {
        System.out.println("功能:play and study");
    }
}
