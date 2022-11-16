package classroom;

public class Animal {
    private boolean hasBody;
    private int age;
    private String name;
    private String color;

    public int energy = 4;

    public Animal(boolean hasBody, String name, String color) {
        this.hasBody = hasBody;
        this.name = name;
        this.color = color;
    }

    public void printAll() {
        System.out.println("Has body" + hasBody);
        System.out.println("Age" + age);
        System.out.println("Name" + name);
        System.out.println("Color" + color);
        System.out.println("Energy" + energy);

    }

    public void walk() {
        if (energy <= 0) {
            System.out.println("not enoiugh energy to walk");
            System.out.println("feed plz");
        } else {

            System.out.println("walking");
            energy--;
            System.out.println("Current energy" + energy);
        }
    }

        public void speak() {
            System.out.println("speaking");
        }

        public void eat() {
            if (energy < 4) {
                energy++;
                System.out.println("eating");
                System.out.println("Current energy" + energy);
            } else {
                System.out.println("full stomach");
                System.out.println("Current energy" + energy);
            }
        }


    public boolean hasBody() {
        return hasBody;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getEnergy() {
        return energy;
    }

    public void setAge(int age) {
        this.age = age;
    }
}