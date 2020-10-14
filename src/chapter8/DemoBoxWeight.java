package chapter8;

/*
Класс параллелепипед
 */
class Box {
    double width; // ширина
    double height; // высота
    double depth; // глубина

    //Конструктор, применяемый при отсутствии параметров
    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // Конструктор при создании куба
    Box(double len) {
        this.width = len;
        this.height = len;
        this.depth = len;
    }

    // Конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    //Клонирование
    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return (width * height * depth);
    }
}

// расширить класс Box, включив в него поле вес
class BoxWeight extends Box {
    double weight;

    // Первый вариант конструктора
/*    BoxWeight(double w, double h, double d, double m){
        this.width = w;
        this.height = h;
        this.depth = d;
        this.weight = m;
    }*/
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // может применяться даже тогда когда width; height; depth; являются закрытыми полями(private)
        weight = m;
    }
    double vol(){
        return (super.volume());
    }
    //Super может быть использован:
    // 1. Для ссылки на конструктор в родительском классе
    // 2. Переменную или метод в родительском классе
}

class ColorBox extends Box {
    String color;

    ColorBox(double w, double h, double d, String c) {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.color = c;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        Box simpleBox = new Box(10, 20, 10);
        System.out.println(simpleBox.volume());
        BoxWeight boxOne = new BoxWeight(10, 20, 15, 34.3);
        System.out.println(boxOne.volume());
        ColorBox colorBox = new ColorBox(4, 20, 8, "white");
        System.out.println(colorBox.volume());

    }
}