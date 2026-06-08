package Oops;

public class PassingClassesToMethods {
     public static class car {
        String name;
        int seats;
        float lenght;
        float capacity;
        void print(){      // this is the methods if the public = then any where we can access it nad if private than not
            System.out.println(name+" " + seats+" "+lenght+" "+ capacity);
        }

    }
    public static void main(String [ ] args){
        car c = new car();
        c.name ="kia";
        c.seats = 4;
        c.lenght = 3;
        c.capacity = 120;

        System.out.println(c.seats);
//          System.out.println(c.seats + c.length + c.capacity);
        c.print();



    }
}
