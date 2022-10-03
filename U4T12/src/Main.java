import cn.com.my.CountNumber;
import cn.com.my.MobileTelephone;
import cn.com.my.SIMOfChinaMobile;
import cn.com.my.SIMOfChinaUnicom;

public class Main {
    public static void main(String[] args) {
        SIMOfChinaMobile chinaMobile=new SIMOfChinaMobile();
        SIMOfChinaUnicom chinaUnicom=new SIMOfChinaUnicom();
        MobileTelephone phone0=new MobileTelephone();
        MobileTelephone phone1=new MobileTelephone(chinaMobile);
        phone1.useSIM(chinaUnicom);
        CountNumber countNumber=new CountNumber();
        countNumber.count("2314EDFA31");

    }

}
