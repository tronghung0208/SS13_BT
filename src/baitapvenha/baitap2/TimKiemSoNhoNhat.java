package baitapvenha.baitap2;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemSoNhoNhat {
    public static Scanner sc = new Scanner(System.in);

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int searchMinNumber(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int searchNumber(int[] arr, int inputNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputNumber) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrs = getArr();
        System.out.println(Arrays.toString(arrs));
        int minNumber = searchMinNumber(arrs);
        System.out.println("Số nhỏ nhất là: " + minNumber);
        System.out.println("Nhập vào số cần tìm: ");
        int inputNumber = Integer.parseInt(sc.nextLine());
        int resultNumber = searchNumber(arrs, inputNumber);
        System.out.println("số cần tìm là : " + arrs[resultNumber] + " tại vị trí " + resultNumber);
    }
}
