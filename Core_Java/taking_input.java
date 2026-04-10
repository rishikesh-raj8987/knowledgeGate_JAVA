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
        System.out.println("Enter the value of float");
        float f =scn.nextFloat();
        System.out.println(f);

        System.out.println("Enter the long float value");
        double d =scn.nextDouble();
        System.out.println(d);

        System.out.println("Enter the long integer value");
        long l =scn.nextLong();
        System.out.println(l);

        System.out.println("Enter the value of String");
        String s =scn.nextLine();
        System.out.println(s);

//        System.out.println("Enter the value of char");
//        char c =scn.nextLine();
//        System.out.println(f);
    }
}
