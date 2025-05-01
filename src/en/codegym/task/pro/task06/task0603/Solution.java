package en.codegym.task.pro.task06.task0603;

/* 
Favorite dish
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Olivia";
        String lastName = "Klinger";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String firstName, String lastName, String favouriteDish) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Favorite dish: " + favouriteDish);
    }

}
