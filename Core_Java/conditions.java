package Core_Java;

public class conditions {
    public static void main (String[] args){

        //question 01 -- the number is even or odd
        int x = 6;
        if(x%2 == 0){
           System.out.println("The number is even");
        }
        else{
//            System.out.println("The number is odd");
//        }
//        System.out.println("this is the answer");

        //question 02 -- compare two number and check which is greater
       int n1=9;
       int n2 = 9;
       if(n1==n2){
           System.out.println("n1 and n2 both are equal");
      }else {
          if(n1>n2){
             System.out.println("n1 is greater:- "+ n1);
          }else{
               System.out.println("n2 is larger:-"+ n2);
          } 
       }
    }
}
