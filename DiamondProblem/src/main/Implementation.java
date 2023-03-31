package main;

interface A {
    default void display(){
        System.out.println("display from A");
    }
}

interface B{
    default void display(){
        System.out.println("display from B");
    }
}

public class Implementation implements A,B{     //implementing  two interfaces A & B

    //if you do not use you own implementation it will be confused that which method to call is called as Diamond problem in java


                    //we have to give our own implementation
//    @Override
//    public void display(){
//        System.out.println("display from Implementation class");
//    }

    @Override                   //calling the super interface display();
    public void display() {
        A.super.display();
    }

    public static void main(String[] args) {

        Implementation imp  = new Implementation();
        imp.display();

    }
}
