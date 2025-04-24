package en.codegym.task.jdk13.task04.task0403;

/* 
What's the cat's name?
*/

public class Cat {
    private String name = "nameless cat";

    public void setName(String name) {
        //write your code here

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Charlie");
        System.out.println(cat.name);
    }
}
