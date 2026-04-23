package Pattern_Printing;

import java.util.Scanner;

public class question03 {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:-  ");
        int n = scn.nextInt();
//        for(int i = 1; i<=n;i++){
//            for(int j =1;j<=i;j++){
//                for (int k=1;k<=n-i;k++){
//                    System.out.print("\t");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int sp = n-1; int star =1;
        for(int i =1;i<=n;i++){
            System.out.println(sp + " , " + star);
            sp--;
            star++;
        }
    }
}
