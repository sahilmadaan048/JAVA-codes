class Person {

    // Private variable
    private String name;

    // Setter method
    public void setName(String n) {
        name = n;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class PersonDemo {
    public static void main(String[] args) {

        Person p = new Person();

        p.setName("Sahil");   // setting value
        System.out.println("Name is: " + p.getName());  // getting value
    }
}