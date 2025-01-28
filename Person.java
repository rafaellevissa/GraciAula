// Definition of the Person class
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
    }
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("David", 30);

        // Displaying information
        person1.displayInformation();

        // Modifying attributes using setter methods
        person1.setName("Raphael");
        person1.setAge(35);

        // Displaying updated information
        System.out.println("\nAfter update:");
        person1.displayInformation();
    }
}
