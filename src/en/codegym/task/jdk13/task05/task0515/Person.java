package en.codegym.task.jdk13.task05.task0515;

/* 
Initializing objects
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public void initialize(String name, int money, char sex) {
        this.name = name;
        this.money = money;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
