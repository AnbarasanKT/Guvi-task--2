
java
// Base class Person
class Person {
    // Attributes of Person class
    private String name;
    private int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for Person class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Employee that extends Person
class Employee extends Person {
    // Additional attributes for Employee class
    private String employeeId;
    private double salary;

    // Constructor for Employee class
    public Employee(String name, int age, String employeeId, double salary) {
        // Using super to initialize the Person attributes
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter methods for Employee class
    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee's information
    @Override
    public void displayInfo() {
        // Call the displayInfo method of Person class
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }
}