package chapter7;
// Variable-length arguments
// Старый подход
public class VarArgs {
    static void printElementFromArray(int arr[]){
        System.out.print("Количество аргументов " + arr.length + " ");
        for (int i: arr){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {

        printElementFromArray(new int[]{1,2});
        printElementFromArray(new int[]{1,2,3});
    }
}
