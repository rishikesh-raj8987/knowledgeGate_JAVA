package Core_Java;

import java.util.Scanner;

public class conditions03 {
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want check");
        int n =scn.nextInt();
        if(n != 0){
            if(n/3 == 0){
                System.out.println("1");
            } else if (n/5 == 0){
                System.out.println("2");
            } else if (n/3 ==0 && n/5==0) {
                System.out.println("3");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
