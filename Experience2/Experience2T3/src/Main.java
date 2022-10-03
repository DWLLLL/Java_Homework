import cn.com.my.AmericanPeople;
import cn.com.my.BeijingPeople;
import cn.com.my.ChinaPeople;
import cn.com.my.People;

public class Main {
    public static void main(String[] args){
        People people=new People();
        ChinaPeople chinaPeople=new ChinaPeople();
        AmericanPeople americanPeople=new AmericanPeople();
        BeijingPeople beijingPeople=new BeijingPeople();
        chinaPeople.speakHello();
        chinaPeople.chinaMartial();
        chinaPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.speakHello();
        americanPeople.AmericanBoxing();
        americanPeople.averageHeight();
        americanPeople.averageWeight();
        beijingPeople.speakHello();
        beijingPeople.chinaMartial();
        beijingPeople.averageHeight();
        beijingPeople.averageWeight();
    }
}
