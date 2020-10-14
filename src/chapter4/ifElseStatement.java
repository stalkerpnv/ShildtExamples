package chapter4;

public class ifElseStatement {

    /*
    Сравнение двух чисел
     */
    public static void comparisonOfTwoNumbers(int a, int b){
        if (a < b) {
            System.out.println("B больше чем A");
        }
        else if (a>b){
            System.out.println("A больше чем B");
        }
        else {
            System.out.println("A равен B");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        comparisonOfTwoNumbers(a,b);

        boolean bool = true;
        if(bool){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
