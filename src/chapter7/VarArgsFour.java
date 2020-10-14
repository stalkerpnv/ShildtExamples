package chapter7;
/*
Аргументы меременной среды и неодназначность
 */
public class VarArgsFour {
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

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false);
        //vaTest(); Ошибка неодназначности
    }
}
