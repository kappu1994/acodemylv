package classroom;

public class methods {
    public static void main(String[] args) {
        printMyName();
        System.out.println("Nikita Milka");

        String fullName = "John Doe";
        printName("John Doe");
        printName(fullName);

        // Create method -> name, surname, age
        // My name is name surname. I am age years old;

//        printNameSurnameAge("Nikita", "Milka", 28);

//        for(int i = 0; i < 3; i++) {
//            printNameSurnameAge("Nikita", "Milka", 28);
//        }

        System.out.println(isPalindrome("kayak"));

        String name = "Nikita";
        String lastName = "Milka";
        int myAge = 28;
        printNameSurnameAge(name, lastName, myAge, 5);

        int sumResult = sum(20, 30);
        System.out.println(sumResult);
    }

    public static void printMyName() {
        System.out.println("Nikita Milka");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printNameSurnameAge(String name, String lastName, int age, int loopCount) {
        for (int i = 0; i < loopCount; i++) {
            System.out.printf("My name is %s %s. I am %d years old%n", name, lastName, age);
        }
        //System.out.println("My name is: " + name + " " + lastName + "." + " I am " + age + " years old");
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    // create method returns booelna
    //palindomre = civic, kayak, nagan
    //method receives String as parameter
    //chartAt() civic:chartAt(0) chartAt(1)
    //return "".equals(word);

    public static boolean isPalindrome(String word) {
        String palindrome = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            // palindrome = palindrome + word.charAt(i);
            palindrome += word.charAt(i);
        }
        System.out.println("Actual: " + palindrome);
        return palindrome.equals(word);

        // cayac
        // [c] [a] [y] [a] [c]
        // "" = "" + "c"
        // "c" = "c" + "a"
        // "ca" = "ca" + "y"
    }
}