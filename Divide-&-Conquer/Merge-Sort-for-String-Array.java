import java.util.*;
public class Main {
    public static void printArr(String[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<=arr.length-2){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static void merge_sort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        int n1 = mid - si + 1;
        int n2 = ei - mid;

        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[si + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = si;
        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String args[]) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        merge_sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}