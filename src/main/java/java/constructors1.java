package java;

public class constructors1 {
    int x;
    public constructors1(int y){
        x = y;
    }

    public static void main(String[] args){
        constructors1 obj1 = new constructors1(10);
        System.out.println(obj1.x);
    }

}
