package FirstPackage;

import java.util.*;  
class Swap {  
    public static void main(String[] args) {  
       int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = y;  
       y=x;  
       x=t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
       sc.close();
    }    
}  