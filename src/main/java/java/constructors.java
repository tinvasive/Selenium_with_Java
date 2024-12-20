package java;

public class constructors {

    int x;
    String str;
    // value of x 0
    /*
    created one special method
    When method name is same as class name then it is called as constructor
    constructor  is used to initialized the object
     */
    public constructors(){
        x = 100;
        str ="preetam";
    }

    public static void main(String[] args){
        constructors obj1 = new constructors();
        System.out.println(obj1.x + " " + obj1.str);
    }

}

