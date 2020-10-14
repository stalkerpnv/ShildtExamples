package chapter7;

/*
Класс параллелепипед
 */
public class Box {
    double width; // ширина
    double height; // высота
    double depth; // глубина

   /* void volume() {
        System.out.println("volume = " + width * height * depth);
    }*/
   //
    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len){
        this.width = len;
        this.height = len;
        this.depth = len;
    }
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
   void setDim(double w, double h, double d){
       width = w;
       height = h;
       depth = d;
   }
    double volume(){
        return (width * height * depth);
    }
}

