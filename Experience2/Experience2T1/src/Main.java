import cn.com.my.English;
import cn.com.my.Greek;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main {

    public static void main(String[] args) {
        English english=new English();
        english.printEnglish();
        Greek greek=new Greek();
        greek.printGreek();
        greek.printEnglish();
    }
}
