package GraciAula;
// Definition of the Person class
public class Person {
    // Private attributes (encapsulation)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for retrieving the name
    public String getName() {
        return name;
    }

    // Setter method for modifying the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving the age
    public int getAge() {
        return age;
    }

    // Setter method for modifying the age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Method to display person information
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
    }

    // Main method to test the class
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
