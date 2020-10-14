package chapter7.recursion;

import java.util.Scanner;

public class RecursionTwo {
    static int[] array;
    static Scanner sc = new Scanner(System.in);

    static void fillArray(int i) {
        if (i == array.length) return;
        else {
            System.out.println("Введите " + i + " элемент массива");
            array[i] = sc.nextInt();
            i++;
            fillArray(i);
        }
    }

    static void printArray(int i) {
        if (i == array.length) return;
        else {
            System.out.println( i + " элемент: " + i);
            i++;
            printArray(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива");

        int size = sc.nextInt();
        array = new int[size];
        fillArray(0);
        printArray(0);
    }

}
