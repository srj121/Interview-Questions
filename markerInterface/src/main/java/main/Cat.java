package main;

public class Cat implements Permission {

    void meow(){
        System.out.println("Meow!");
    }
    public static void main(String[] args) {

        Cat c = new Cat();
                if (c instanceof Permission){       //if you implement the marker interface it can act as a key as you like
                    c.meow();                       //is it is an instance of Permission then it will be invoked
                }
                else{
                    System.out.println("Permission not granted");   // if you don't implement it will give you this message
                }
    }

}
