package HomeTasks;

import java.util.Scanner;
// test
public class Task7_4 {
    public static String[] words() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int numberOfWords = scan.nextInt();

        String[] words = new String[numberOfWords];
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Type word Nr. " + i);
            words[i] = scan.next();
        }
        scan.close();
        return words;
    }

    public static void main(String[] args) {
        String[] words = words();
        for (String word:words){
            System.out.println(word);

        }
    }
}
