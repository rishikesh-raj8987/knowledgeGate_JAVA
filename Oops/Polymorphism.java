package Oops;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow ");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("gurrrrr");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hello");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }
    public static void main(String[] args){
        Dog d =new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Human h = new Human();
        Pikachu p = new Pikachu();

        d.speak();  // methods
        c.speak();  // methods
        l.speak();  // methods
        h.speak();  // methods
        p.speak();  // methods
    }
}
