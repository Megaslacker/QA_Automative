package ClassWork;

import java.util.Arrays;

public class Class_7 {
    public static void main(String[] args) {
        String str = new String("  I like_Moscow   ");
        String str1 = new String("Cat");
        String result = str+str1;
        System.out.println(result);
        System.out.println(str.concat(str1).concat("xxx"));
        System.out.println( str.equalsIgnoreCase(str1));
        System.out.println(str.substring(3,8));
        Arrays.asList(str.split(" |_")).stream().forEach(word -> System.out.println(word));
        System.out.println(String.valueOf(true));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('i', '%'));
        System.out.println(str.trim());
        System.out.println(str.isEmpty());
        String [] names = {"John", "JAck", "Jose" };
        String hello = "Hello, %s";
        Arrays.asList(names).stream().forEach(name -> System.out.println(String.format(hello, name)));

    }
}
