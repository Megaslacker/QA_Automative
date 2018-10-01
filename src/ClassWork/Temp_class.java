package ClassWork;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Temp_class {
    public static void main(String[] args) {
        Person perso1 = new Person();
        Person person2 = new Person(1);
        Person person3 = new Person(2, "John");
        Person person4 = new Person(2, "John", 25);
        person4.print();

    }
}
