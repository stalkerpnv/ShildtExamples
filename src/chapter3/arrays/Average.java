package chapter3.arrays;

/*
Вычисление среднего значения
 */
public class Average {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum = numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Среднее значение равно = " + average);
    }
}
