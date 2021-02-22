package lesson12;

public class Main {

    public static void main(String[] args) {

        String firstName = "Gjohntr";
        String lastName = "Smith";
        int age = 25;
        boolean isID = false;

        if (firstName.contains("Jo")) {
            System.out.println(firstName + " " + lastName + " welcome");
        } else {
            System.out.println(firstName + " " + lastName + " go home");
        }

    }
}

// contains - содержание в слове
// equals - полностью слово
// ! (перед переменной) - отрицание
