package Oops;

public class PassingClassesToMethods {
     public static class car {
        String name;
        int seats;
        float lenght;
        float capacity;
        void print(){
            System.out.println(name+" " + seats+" "+lenght+" "+ capacity);
        }

    }
    public static void main(String [ ] args){
        car c = new car();
        c.name ="kia";
        c.seats = 4;
        c.lenght = 3;
        c.capacity = 120;
        c.print();

    }
}
