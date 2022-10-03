import cn.com.my.FlashMemory;

public class Test {
    public static void main(String[] args){
        FlashMemory flashMemory=new FlashMemory();
        flashMemory.printName();
        System.out.println("重量："+flashMemory.computerWeight()+"kg");
        System.out.println("价格："+flashMemory.printPrice()+"元");
        System.out.println("名称："+flashMemory.computerName());
        flashMemory.printFunction();
    }
}
