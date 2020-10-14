package chapter6;

public class TestStack {
    public static void main(String[] args) {
        Stack stackOne = new Stack();
        Stack stackTwo = new Stack();

        for (int i = 0; i < 10; i++) {
            stackOne.push(i);
        }
        for (int i = 0; i < 20; i++) {
            stackTwo.push(i);
        }
        System.out.println("Содержимое стека mystack1");
        for (int i = 0; i < 10; i++) {
            System.out.println(stackOne.pop());
        }
        for (int  i = 0;  i < 20;  i++) {
            System.out.println(stackTwo.pop());
        }

    }
}
