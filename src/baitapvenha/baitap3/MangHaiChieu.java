package baitapvenha.baitap3;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = getArr();
        System.out.println("Nhập vào số cần tìm");
        int searchNumber = Integer.parseInt(sc.nextLine()); // Số cần tìm kiếm

        boolean found = findNumber(arr, searchNumber);

        if (found) {
            System.out.println("Số " + searchNumber + " đã được tìm thấy trong mảng.");
        } else {
            System.out.println("Số " + searchNumber + " không tồn tại trong mảng.");
        }
    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
    public static boolean findNumber(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Số " + target + " được tìm thấy tại vị trí [" + i + "][" + j + "]");
                    return true; // Trả về true nếu tìm thấy số
                }
            }
        }
        System.out.println("Số " + target + " không được tìm thấy trong mảng.");
        return false; // Trả về false nếu không tìm thấy số
    }
}
