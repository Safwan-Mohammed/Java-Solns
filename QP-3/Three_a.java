
class SuperClass{
    int a = 10;
}

class SubClass extends SuperClass{
    int b = 100;
}

public class Three_a {
    public static void main(String[] args){
        SubClass obj1 = new SubClass();
        System.out.println("Value of a: "+ obj1.a);
        System.out.println("Value of b: "+ obj1.b);
    }
}
