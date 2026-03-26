
package java.hoomwork;

import java.util.Scanner;

public class JavaHoomwork {

    

    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
       System.out.print("Enter n: "); 
        int n = input.nextInt();      
         for (int i = 1; i <= n; i++) {
              int result = i * i;
            System.out.println(i + " * " + i + " = " + result);
             
        }
    }
}
     
     
     

