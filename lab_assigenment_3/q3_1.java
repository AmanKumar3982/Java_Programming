import java.util.*;

public class q3_1 {
    public static int[] input_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + "= ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void count_frequency(int[] arr) {
        Arrays.sort(arr);
        int current = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                System.out.println(current + " occurs " + count + " times");
                current = arr[i];
                count = 1;
            }
        }
        System.out.println(current + " occurs " + count + " times");
    }

    public static void main(String[] args) {
        int array[] = input_array();
        count_frequency(array);
    }
}
