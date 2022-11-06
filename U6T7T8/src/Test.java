import com.cn.my.AnalyNumber;
import com.cn.my.PrintNumber;
import com.cn.my.RandomNumber;
import com.cn.my.ReplaceNumber;

import java.io.File;
    public class Test {
        public static void main(String[] args){
            File file = new File("data.dat");
            RandomNumber randomNumber = new RandomNumber();
            randomNumber.output(file);
            AnalyNumber analyNumber =new AnalyNumber();
            analyNumber.fileinput(file);
            ReplaceNumber replaceNumber = new ReplaceNumber();
            replaceNumber.replace(file);
            analyNumber.fileinput(file);
            File file1 = new File("mydata.dat");
            PrintNumber printNumber = new PrintNumber();
            int n =27;
            printNumber.print(file1, n);
        }
}
