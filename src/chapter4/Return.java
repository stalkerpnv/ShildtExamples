package chapter4;
/*
Он служит для выполнения явного выхода из метода, т.е.
он снова передает управление коду, из которого был вызван данный метод.
Как таковой этот оператор относится к операторам перехода.
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата");
        if(t) return;
        System.out.println("Этот оператор выполнятся не будет");
    }
}
