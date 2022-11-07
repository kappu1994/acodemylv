package classroom;

public class conditionals {

    public static void main(String[] args) {
        // 1. if
        if (1 < 2) {
            System.out.println("Yes true");
        }

        if (1 > 2) {
            System.out.println("fine");
        }

        //boolean
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("this is summer!");
        }

        String name = "Andre";
        if (name.equals("Andre")) {
            System.out.println("yes yes yes");
            System.out.println("+++");
        }

        if (name.contains("and")) {
            System.out.println("+++++");
        }

        if (!name.contains("and")) {
            System.out.println("right");
        }

        if (2<3) System.out.println("yesyesyeys");

        //if else

        int studentAge= 17;
        if (studentAge<18) {
            System.out.println("dozhdisj dnjuhu bruh");
        }
        else {
            System.out.println("davay nalivay");
        }

        //if else if else

        int currentTime = 15 ;
        if (currentTime <= 11) {
            System.out.println("good morning");
        }
        else if (currentTime >11 && currentTime <17) {
            System.out.println("good day");
        }
        else {
            System.out.println("evening sir");
        }

        }

        }

