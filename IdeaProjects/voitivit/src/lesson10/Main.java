package lesson10;

public class Main {

    public static void main(String[] args) {

        String firstName="John";
        String lastName="Smith";
        int age = 22;
        boolean isId = true;

        if (isId == true && age>21) {
            System.out.println(firstName + " " + lastName + " welcome");
        } else {
            System.out.println(firstName + " " + lastName + " go home");
        }

    }
}
