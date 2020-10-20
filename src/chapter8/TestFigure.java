package chapter8;

/*
суперкласс Figure для хранения размеров двумерного объекта, а также определяется метод area ( ) для расчета площади этого объекта.
Кроме того, в этой программе создаются два класса,
Rectangle и Triangle, производные от класса Figure. Метод area () переопределяется в каждом из этих подклассов,
чтобы возвращать площадь четырехугольника и треугольника соответственно.
 */
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена");
        return 0;
    }
}

// прямоугольник
class Reactagle extends Figure {
    Reactagle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        return (dim1 * dim2);
    }
}

// класс прямоугольного треугольника
class RightTriagle extends Figure {
    RightTriagle(double a, double b) {
        super(a, b);

    }

    @Override
    double area() {
        return (dim1 * dim2 / 2);
    }
}

class Triagle extends Figure {
    double dim3;

    Triagle(double a, double b, double c) {
        super(a, b);
        dim3 = c;
    }

    @Override
    double area() {
        double p = (dim1 + dim2 + dim3) / 2;
        return (Math.sqrt(p * (p - dim1) * (p - dim2) * (p - dim3)));
    }
}

public class TestFigure {
    public static void main(String[] args) {
        Reactagle reactagle = new Reactagle(1,5);
        RightTriagle rightTriagle = new RightTriagle(2,4);
        Triagle triagle = new Triagle(2,3,4);

        System.out.println(reactagle.area());
        System.out.println(rightTriagle.area());
        System.out.println(triagle.area());

    }
}

