package classroom;

public class objexample {
    public static void main(String[] args) {
        Animal cat = new Animal(true, "Niksi", "tricolor");
        cat.printAll();


        cat.printAll();
        cat.walk();
        cat.walk();
        cat.walk();
        cat.walk();

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println("in 1 year he will be one year");
        cat.setAge(1);
        System.out.println("Cat age is:" + cat.getAge());



        Animal cow = new Animal(true, "jack", "blue");
        cow.walk();
        cow.walk();
        cow.walk();
        cow.eat();
        System.out.println(cow.getName());
        System.out.println(cow.getAge());
        System.out.println("in 1 year he will be one year");
        cow.setAge(123);
        System.out.println("Cat age is:" + cow.getAge());
    }
}
