package HomeTasks;

import java.util.Scanner;

public class Task7_1 {
    public static String[] strings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        int numberOfStrings = scan.nextInt();
        scan.nextLine();
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Type string Nr. "+(i+1));
            strings[i]=scan.nextLine();
        }
        scan.close();
        return strings;
    }

    public static void main(String[] args) {
        String[] strings = strings();
        for (String out:strings){
            System.out.println(out);
        }
    }
}
