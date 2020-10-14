package exercise3;

import java.util.Scanner;

public class Tringle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double a = input.nextInt(); 
       double b = input.nextInt(); 
       double c = input.nextInt(); 
    do { 
       if ( a <= 0 || b <= 0 || c <= 0 ){
         break;
         System.out.println("Values are not correct!")
       } else if(a + b < c || a + c < b || b + c < a ) { 


       }

      }
        System.out.println("End");
    }

}
