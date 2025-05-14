package en.codegym.task.jdk13.task05.task0510;

/* 
Initializing cats
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 6;
        this.address = null;
        this.color = "tricolor";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "tricolor";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.address = null;
        this.color = "tricolor";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 5;
        this.address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 5;
    }

    public static void main(String[] args) {

    }
}
