package Core_Java.loops1;

public class Q2 {
    public static void main(String[] args) {
        //print even number from 1 to 100
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println( "even no.= " +i);
            }
        }
        System.out.println("  ");
        //for odd number from 1 to 100
        for (int j=1;j<=100;j++){
            if(j%3==0){
                System.out.println("odd no.= "+ j);
            }
        }
    }
}
