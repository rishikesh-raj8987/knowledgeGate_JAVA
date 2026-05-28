package questions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        // find the selling or cost price and find it is profitable or not
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the cost of the product :- ");
        float cost = scan.nextFloat();
        System.out.println("Enter the value of product sell");
        float sell = scan.nextFloat();


        if(sell>cost){
            float profit = sell - cost ;
            System.out.println("profit of "+ "$"+ profit);
        }
        else{
            float loss= sell-cost;
            System.out.println("loss of "+ "$ "+loss);
        }

    }
}
