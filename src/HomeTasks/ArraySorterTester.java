package HomeTasks;

/**
 * Created by kotok_artem on 01.10.2018.
 */
public class ArraySorterTester {
    public static void main(String[] args) {
        int[] arr = Task2_1.randomArray(1000);
        double start = System.currentTimeMillis();
        // Task2_1.printArray(arr);
        //ArraySorter.bubleSort(arr);
        ArraySorter.minMaxSorting(arr);
        //Task2_1.printArray(arr);
        double finish = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(finish);
        System.out.println(finish-start);

    }
}
