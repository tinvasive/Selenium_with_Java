package org.example;

public class objectCreation {
    public static void main(String[] args) {

        /* object creation using new keyword
        obj1 is reference object for clas objectCreation
        using obj1 calling method having properties/logic of code
         */

        objectCreation dog = new objectCreation();
        dog.usingNewKeyword();

    }

    public void usingNewKeyword(){
        System.out.println("Object Creation By using New Keyword");
    }


}
