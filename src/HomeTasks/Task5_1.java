package HomeTasks;

/**
 * Created by kotok_artem on 02.10.2018.
 */
public class Task5_1 {
    public static void main(String[] args) {
        Tester tester1 = new Tester("John", "Smith", 5, "C1", 1000);
        tester1.printInfo();
        tester1.printInfo(true);

        tester1.sayHello();
        tester1.sayHello("C1");

        System.out.println(Tester.jobJequest(2));
        System.out.println(Tester.jobJequest(2,"C1"));
    }
}
