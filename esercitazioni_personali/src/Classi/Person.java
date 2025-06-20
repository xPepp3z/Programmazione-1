package Classi;

public class Person {	//attributi
    
    public String name;
    public String surname;
    public int age;

    // Costruttore
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Metodi getter (opzionali ma utili)
    /*public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }*/
}
