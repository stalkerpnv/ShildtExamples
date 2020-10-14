package chapter7;
/*
Аргументы переменной среды и перезагрузка
 */
public class VarArgsThree {
    static void vaTest(int... values) {
        System.out.print("vaTest(int... values): Количество аргументов " + values.length);
        System.out.print(" Элементы ");
        for (int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean... values) {
        System.out.print("vaTest(boolean... values): Количество аргументов " + values.length);
        System.out.print(" Элементы ");
        for (boolean i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void vaTest(String msg, int... values) {
        System.out.print("vaTest(String msg, int... values)"+ msg + "Количество аргументов " + values.length);
        System.out.print(" Элементы ");
        for (int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Проверка: ",10,20);
        vaTest(true,false,true);
    }
}
