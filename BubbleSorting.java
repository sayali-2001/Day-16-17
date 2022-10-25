package NewPackage;

public class BubbleSorting {
    static void sorting(Integer[] arr) {
        Integer temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Integer[] arr = {23,56,12,6,34,65};
        System.out.println("Before sorting");
        printArray(arr);
        sorting(arr);
        System.out.println("\narray  After sorting");
        printArray(arr);
    }
}
