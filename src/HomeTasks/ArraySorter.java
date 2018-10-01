package HomeTasks;

public class ArraySorter {
    public static int[] bubleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int t = 0; t < arr.length - 1 - i; t++) {
                if (arr[t] < arr[t + 1]) {
                    temp = arr[t];
                    arr[t] = arr[t + 1];
                    arr[t + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] minMaxSorting(int[] arr) {
        int tempMin = 0;
        int tempMax = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int min = arr[i];
            int maxPosition = i;
            int minPosition = i;

            for (int t = i; t < arr.length; t++) {
                if (arr[t] > max) {
                    max = arr[t]; //determine Max array value
                    maxPosition = i; //determine Max value position
                }
                if (arr[t] < min) {
                    min = arr[t]; //determine Min array value
                    minPosition = t; //determine Min value position
                }
            }
            tempMin = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = tempMin;

            tempMax = arr[maxPosition];
            arr[maxPosition] = arr[arr.length - i - 1];
            arr[i] = tempMax;


        }
        return arr;
    }
}
