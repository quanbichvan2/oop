package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, i, size;
        while (true) {
            System.out.println("press 1 to delete a number. \npress 2 to delete a number by the position in the list.");
            b = input.nextInt();
            if (b == 1) {
                System.out.println("get a size for your array: ");
                size = input.nextInt();
                int a[] = new int[size];
                while (size >= 0) {
                    for (i = 0; i < size; i++) {
                        System.out.println("write numbers into array: ");
                        a[i] = input.nextInt();
                    }
                    break;
                }
                System.out.println("write a number you want to remove from the array");
                int number;
                number = input.nextInt();
                int c[] = new int[size - 1];
                int k = 0;
                for (i = 0; i < size; i++) {
                    if (a[i] != number) {
                        c[k] = a[i];
                        k++; // cộng vị trí của phần tử
                    }
                }
                size = k;
                //size = với số phần tử đang được gán
                System.out.println("the number in array now: ");
                for (i = 0; i < size; i++) {
                    System.out.println(c[i] + " ");
                }
            }
            if (b == 2) {
                System.out.println("get a size for your array: ");
                size = input.nextInt();
                int a[] = new int[size];
                while (size >= 0) {
                    for (i = 0; i < size; i++) {
                        System.out.println("write numbers into array: ");
                        a[i] = input.nextInt();
                    }
                    break;
                }
                System.out.println("the number in array: ");
                for (i = 0; i < size; i++) {
                    System.out.println(a[i]);
                }
                System.out.println("write a number you want to remove from the array");
                int number;
                number = input.nextInt();
                for (i = number; i < size-1; i++) {
                        a[i] = a[i + 1];
                    }
            size = size-1;
                System.out.println("the number in array now: ");
                for (i = 0; i < size; i++) {
                    System.out.println(a[i] + " ");
                }
            }
        }
    }

}

//tìm giá trị lớn nhất trong 1 mảng
// nhập mảng

//chương trình nhập 1 mảng tự xóa 1 số bất kì, 1 mảng xóa số theo vị trí trong phần tử