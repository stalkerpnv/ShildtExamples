package chapter3.arrays;

public class Array {
    public static void main(String[] args) {
        int[] monthDays; // объявление массива(задание типа элементов и название);
        monthDays = new int[12]; // задание размера(выделение памяти под массив)
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        System.out.println("В апреле " + monthDays[3] + " дней");
    }
}
