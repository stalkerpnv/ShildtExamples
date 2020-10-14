package chapter6;

public class Stack {
    int stack[] = new int[10];
    int tos;
    // Инициализировать вершину стека
    Stack(){
        this.tos = -1;
    }
    // Вставить элемент в стек
    void push(int item){
        if(tos==9) System.out.println("Стек заполнен");
        else stack[++tos] = item;
    }
    //Извлечь элемент из стека
    int pop(){
        if(tos<0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
}
