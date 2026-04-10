package Core_Java;

import java.util.Scanner;

public class taking_input {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //taking different different output from user

//        int n = scn.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }
//        System.out.println("done");

//        System.out.println("Enter the value of float");
//        float f =scn.nextFloat();
//        System.out.println(f);
//
//        System.out.println("Enter the long float value");
//        double d =scn.nextDouble();
//        System.out.println(d);
//
//        System.out.println("Enter the long integer value");
//        long l =scn.nextLong();
//        System.out.println(l);
//
//        System.out.println("Enter the value of String");
//        String name =scn.nextLine();
//        System.out.println(name);



//           when we want to take integer and string together
        System.out.println("Enter your name and number"); // first enter the number than name
        int n = Integer.parseInt(scn.nextLine());
//        int n = scn.nextInt();   // direct enter the number
        String name =scn.nextLine();
        System.out.println("hello" + name + " counting starts");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
