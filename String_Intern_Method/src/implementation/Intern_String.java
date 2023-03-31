package implementation;

import java.util.Objects;

public class Intern_String {

    public static void main(String[] args) {

        String str1 = "Suraj";      //string literal stored in string constant pool

        String str2 = new String("Suraj");     //String stored with object in heap

        System.out.println(str1 == str2);  //first it is checking the reference in the scp

        String str3 = str2.intern(); //intern() will store the same value in the scp from the object with help of { Str3 }

        System.out.println(str3 == str2);       //it is checking for the references in the scp
        System.out.println(str3 .equals(str2)); //it is checking for the values
        System.out.println(str3 .equals(str2)); //it is checking for the values
        System.out.println(str3 == str1);       //it is checking the reference in the scp

    }
}
