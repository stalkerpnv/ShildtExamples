package chapter7;

// Вложенный класс Inner опеределен внутри класса Outer;
// Класс Inner имеют доступ к параметрам класса Outer;
class Outer {
    int outX = 100;

    void test() {
        Inner inner = new Inner();
    }

    class Inner {
        int y = 10;
        void display() {
            System.out.println(outX);
        }
        void showY(){
            System.out.println(y);
        }
    }
}
class InnerClassDemo{
    public static void main(String[] args) {
        Outer out = new Outer();

    }
}
