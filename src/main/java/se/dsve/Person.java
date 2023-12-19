package se.dsve;

public class Person {
    private String name;
    private int age;

    // Standardkonstruktör
    public Person() {
    }

    // Konstruktör med alla egenskaper
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter för namn
    public String getName() {
        return name;
    }

    // Setter för namn
    public void setName(String name) {
        this.name = name;
    }

    // Getter för ålder
    public int getAge() {
        return age;
    }

    // Setter för ålder
    public void setAge(int age) {
        this.age = age;
    }

    // En metod för att returnera en strängrepresentation av objektet
    @Override
    public String toString() {
        return "Person{" +
                "namn='" + name + '\'' +
                ", ålder=" + age +
                '}';
    }
}
