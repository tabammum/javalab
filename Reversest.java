
package reversest;
import java.util.Scanner;



public class Reversest {
    

    
    public static void main(String[] args) {
       System.out.println("enter the string to reverse:");
       Scanner input=new Scanner(System.in);
     String str=input.nextLine();
     String reverse="";
        for(int i=str.length()-1;i>=0;i--){
           
                
            reverse=reverse+str.charAt(i);
        }
        System.out.println("reverse string is:");
        System.out.println(reverse);
    
        
    }
    
}
