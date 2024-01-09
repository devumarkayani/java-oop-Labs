public class Encapsulation {

    // Private variables (data)
    private String name;
    private int age;

    // Public methods to access and modify the private variables
    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String newName) {
        // You can add validation logic here if needed
        name = newName;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int newAge) {
        // You can add validation logic here if needed
        age = newAge;
    }

    // Example method that operates on the encapsulated data
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of the class
        Encapsulation person = new Encapsulation();

        // Use the setter methods to set the values
        person.setName("John Doe");
        person.setAge(25);

        // Use the getter methods to retrieve and print the values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Use a method that operates on the encapsulated data
        person.printDetails();
    }
}
