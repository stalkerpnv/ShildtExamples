package chapter1;

/*
Осласть видимости переменных
 */
public class Scope {
    static int a; // доступен в рамках класса Scope

    public static void main(String[] args) {
        a =12;
        int b = 10; // доступен для всего метода main()
        if (b == 10) {// Начало новой области действия - блок кода
            int c = 20; // Доступно только этому блоку кода;
            System.out.println(b * c);
        }
        //c = 30 // Ошибка
        System.out.println(a);
        System.out.println(b);
    }
}
