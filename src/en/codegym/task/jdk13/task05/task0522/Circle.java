package en.codegym.task.jdk13.task05.task0522;

/* 
Max constructors
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle anotherCircle) {
        this.x = anotherCircle.x;
        this.y = anotherCircle.y;
        this.radius = anotherCircle.radius;
    }

    public Circle() {
        this.x = 5;
        this.y = 10;
        this.radius = 7;
    }

    public Circle(double x, double radius){
        this.x = x;
        this.radius = radius;
        this.y = x;
    }

    public static void main(String[] args) {

    }
}