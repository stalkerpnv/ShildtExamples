package chapter4;

/*
* Проверка четности значения переменной i
* Если это четное значение, то выполнение цикла продолжается без перехода на новую строку
* */
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println(" ");
        }
    }
}
