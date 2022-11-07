package classroom;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is ur name");
        String name = scanner.nextLine();

        System.out.println("surname");
        String lastName = scanner.nextLine();

        System.out.println("Hello" + name + " " + lastName + "." + "my name is Jack");
        System.out.printf("Hello %s %s. My name is Jack. How can i help you?%n", name, lastName);

        System.out.println("press 1 for reg, press 2 for drop");

        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("please enter date : (dd.mm.yyyy)");
            String regDate = scanner.next();
            System.out.println("ur reg date:" + regDate);
        }
        else if (answer == 2) {
            System.out.println("Ok bb");
            scanner.close();
        }
        else {
            System.out.println("incorrect");
            scanner.close();
        }

        }

    }

