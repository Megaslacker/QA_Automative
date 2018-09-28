package HomeTasks;

import java.util.logging.SocketHandler;

/**
 * Created by kotok_artem on 27.09.2018.
 */
public class Task3_1 {
    public static int minimum(int a, int b){
        return Math.min(a, b);
    }
    public static boolean isEven(int a){
        if (a%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int square(int a){
        return a*a;
    }
    public static int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        int example1 = (int)(Math.random()*10);
        int example2 = (int)(Math.random()*10);
        System.out.println("Int Nr. 1: "+example1);
        System.out.println("Int Nr. 2: "+example2);
        System.out.println("Minimum: " + minimum(example1,example2));
        System.out.println("Even:");
        System.out.println("Int Nr. 1: "+isEven(example1));
        System.out.println("Int Nr. 2: "+isEven(example2));
        System.out.println("Square:");
        System.out.println("Int Nr. 1: "+square(example1));
        System.out.println("Int Nr. 2: "+square(example2));
        System.out.println("Cube:");
        System.out.println("Int Nr. 1: "+cube(example1));
        System.out.println("Int Nr. 2: "+cube(example2));

    }
}
