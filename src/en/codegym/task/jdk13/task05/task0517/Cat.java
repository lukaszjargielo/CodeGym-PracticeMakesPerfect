package en.codegym.task.jdk13.task05.task0517;

/* 
Creating cats
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 6;
        this.color = "tricolor";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "tricolor";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.color = "tricolor";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }

    public static void main(String[] args) {

    }
}
