package main;

class Person{
    //An immutable class is a class whose instances cannot be modified once they are created.
    // To achieve immutability, the class should have final fields that are initialized in the constructor and cannot be changed later.
    // Additionally, the class should not have any setter methods, and any methods that modify the state of the object should return
    // a new instance of the class with the updated state.
    private final int age;
    private final String name;
                                // the class should have final fields that are initialized in the constructor and cannot be changed later.
    Person(int age,String name){
        this.age= age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    //methods that modify the state of the object should return
    // a new instance of the class with the updated state.
    public Person withAge(int age){
        return new Person(age, this.name);
    }
    public Person withName(String name){
        return new Person(this.age, name );
    }

    public String toString(){
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Implementation {

    public static void main(String[] args) {
        Person per = new Person(12,"bunny");

        System.out.println(per);

        String name = per.getName();
        System.out.println(name);

        int age = per.getAge();
        System.out.println(age);

        Person p1 = per.withAge(15);
        Person p2 = per.withName("suraj");

        System.out.println(p1);
        System.out.println(p2);
    }
}
