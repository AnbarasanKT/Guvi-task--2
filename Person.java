
    public class Person {
        // Properties of the Person class
        private String name;
        private int age;

        // Default constructor with default age
        public Person(String name) {
            this.name = name;
            this.age = 18; // Default age
        }

        // Constructor that allows initializing both name and age
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display name and age of the person
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

