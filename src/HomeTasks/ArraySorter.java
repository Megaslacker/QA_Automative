package HomeTasks;

public class ArraySorter {
    public static int[] insertionSort(int[] arr) { // after checking Habr I've understood that in fact this is NOT Insertion Sort.
        int temp = 0;                              // Still it works.
        for (int runner = 1; runner < arr.length; runner++) {

            for (int CheckPosition = 0; CheckPosition < runner; CheckPosition++) {

                if (arr[CheckPosition] > arr[runner]) {
                    temp = arr[runner];

                    for (int shift = runner - 1; shift >= CheckPosition; shift--) {
                        arr[shift + 1] = arr[shift];
                    }

                    arr[CheckPosition] = temp;
                }

            }
        }
        return arr;
    }
    public static int[] insertionSort2(int[] arr) { // found at Habr AFTER my own code worked fine. For learning purposes.
        int temp =0;
        for(int i=1;i<arr.length;i++)
            for(int j=i;j>0 && arr[j-1]>arr[j];j--) // пока j>0 и элемент j-1 > j
            {temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;}        // меняем местами элементы j и j-1
        return arr;
    }

    public static int[] bubbleSort(int[] arr) { // classic Bubble Sort.
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

    public static int[] minMaxSorting(int[] arr) { // Sorting Array by determining Man and Max value and putting them to the head and tail of the unsorted array.
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
