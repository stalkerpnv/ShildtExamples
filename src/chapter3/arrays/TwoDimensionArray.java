package chapter3.arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int twoDArray [][] = new int[4][5]; // левый индекс строка, правый индекс столбец
        int value = 0;
        // Заполнение массива значениями
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = value;
                value++;
            }
        }
        //Вывод массива
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
