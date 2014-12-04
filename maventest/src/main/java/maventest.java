/**
 * Created by hackdream on 14-12-3.
 */
package cc.hotel;
import java.util.*;
import java.lang.reflect.Constructor;
class test{

   // test() {
     //   System.out.println("无参够着");
    //}
    test(int i){
        System.out.println("有参构造函数");
        num = i;
    }
    static void func(){
        System.out.println("cc.123hotel.test");
    }

    static int num = 10;
}
public class maventest {

    static public void main(String argus[]){
        test.func();
        Class<?> temp = null;
        System.out.println("" + test.num);
        try {
             temp = Class.forName("cc.hotel.test");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Constructor<?> cons[] = null;
        cons = temp.getConstructors();

        test a = null;
        try {
           a = (test)cons[0].newInstance(5);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("" + a.num);
    }
}
