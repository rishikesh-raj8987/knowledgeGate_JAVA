package Core_Java.loops1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //display this arithmetic progression 2,5,8,11 .....upto 'n' terms
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value of num:- ");
        int num = scn.nextInt();
        for (int i=2;i<=3*num-1;i+=3){
            System.out.println(i);
        }

    }
}
