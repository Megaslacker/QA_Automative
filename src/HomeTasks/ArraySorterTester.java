package HomeTasks;

/**
 * Created by kotok_artem on 01.10.2018.
 */
public class ArraySorterTester {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = Task2_1.randomArray(length);
        //int[] arr = {88, 77, 80, 64, 28, 23, 3, 36, 61, 96 };
        //double start = System.currentTimeMillis();
        // Task2_1.printArray(arr);
        //ArraySorter.bubleSort(arr);
        Task2_1.printArray(arr);
        ArraySorter.insertionSort(arr);
        Task2_1.printArray(arr);
        //Task2_1.printArray(arr);
//        double finish = System.currentTimeMillis();
//        System.out.println(start);
//        System.out.println(finish);
//        System.out.println(finish-start);

    }
}
