package Lab4;

// Custom class for demonstration
class Person {
    String name;
    int age;
    double salary;
    String department;

    // Constructor
    public Person(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // toString method for displaying Person objects
    @Override
    public String toString() {
        return name + " (" + age + " years, $" + salary + ", " + department + ")";
    }
}