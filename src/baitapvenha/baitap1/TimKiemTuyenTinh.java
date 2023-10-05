package baitapvenha.baitap1;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemTuyenTinh {
    public static Scanner sc=new Scanner(System.in);
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int searchMaxNumber(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int searchMaxNumber2(int[] arr,int inputNumber){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==inputNumber){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrs = getArr();
        System.out.println(Arrays.toString(arrs));
        int maxNumber = searchMaxNumber(arrs);
        System.out.println("Số lớn nhất là: "+maxNumber);
        System.out.println("Nhập vào số cần tìm: ");
        int inputNumber=Integer.parseInt(sc.nextLine());
        int resultNumber=searchMaxNumber2(arrs,inputNumber);
        System.out.println("Số cần tìm là: "+arrs[resultNumber]+" tại vị trí "+resultNumber);
    }
}
