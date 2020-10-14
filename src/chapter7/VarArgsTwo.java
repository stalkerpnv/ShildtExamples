package chapter7;

import java.util.Scanner;

public class VarArgsTwo {
    static void vaTest(int... values) {
        System.out.println("Количество аргументов " + values.length);
        System.out.println("Элементы");
        for (int i : values) {
            System.out.print(i + " ");
        }
    }

    // Использование вместе с обычными параметрами
    // Параметр с переменных количеством аргументов должен стоять последним
    static void doIt(double a, double b, int... values) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Количество аргументов " + values.length);
        System.out.println("Элементы");
        for (int i : values) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3, 4, 5);
        doIt(3.14, 6.5, 7, 5, 2, 5);

    }
}
