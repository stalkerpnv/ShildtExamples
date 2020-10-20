import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество компьютеров");
        System.out.println("Input a");
        double a = sc.nextInt();
        System.out.println("Input b");
        double b = sc.nextInt();
        System.out.println("Input c");
        double c = sc.nextInt();
        double min;
               /* if (a > b) {
            min = b;
            if (b > c) min = c;
        } else if (a > c) {
            min = c;
        }*/
        double [] arr = {a,b,c};
        min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (min>arr[i]) min = arr[i];
        }
        System.out.println("min = " + min);
    }
}

