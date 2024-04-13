class Animal{
    public String color = "white";

    public void eat(){
        System.out.println("I'm Animal");
    }
}

class Dog extends Animal{
    String color = "black";

    public void eat(){
        System.out.println("I'm Dog");
    }
}

public class Three_b{
    public static void main(String[] args){
        Dog d1 = new Dog();
        System.out.println(d1.color);
        d1.eat();

        Animal d2 = new Dog();
        System.out.println(d2.color);
        d2.eat();

        Animal d3 = new Animal();
        System.out.println(d3.color);
        d3.eat();
    }
}