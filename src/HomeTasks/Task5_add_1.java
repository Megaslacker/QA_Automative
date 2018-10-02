package HomeTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

/**
 * Created by kotok_artem on 02.10.2018.
 */
public class Task5_add_1 {
    public static boolean regExpTester1(String toTest) {

        String pattern = ".*[a-zA-Z]{4,}.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(toTest);
        return !m.matches();


    }

    public static boolean regExpTester2(String toTest) {
        String pattern = ".{4}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(toTest);
        return m.matches();
    }

    public static void main(String[] args) {


        System.out.println(regExpTester1("abc$asdd"));
        System.out.println(regExpTester1("abcd1"));

        //        System.out.println(regExpTester2("qw12"));
//        System.out.println(regExpTester2("134"));

    }


}
