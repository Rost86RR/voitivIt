package lesson11;

public class Main {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Smith";
        int age = 17;
        boolean isId = false;

        if (isId == true || age > 21) {
            System.out.println(firstName + " " + lastName + " welcom");
        } else {
            System.out.println(firstName + " " + lastName + " go home");
        }
    }
}
