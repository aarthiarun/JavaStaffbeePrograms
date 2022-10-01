package FirstPackage;

import java.util.Scanner;

class Charexample {
	  public static void main(String[] args) {
	    	int a=5,b=5;
	    char letter = 'o';
	    Scanner reader= new Scanner(System.in);
	    System.out.println("enter a string");
	    String name1=reader.next();
	    System.out.println(name1);
	    System.out.println(letter); 
	    System.out.println(a+b); 
	   
	    String name="aarthi";
	    System.out.println("the name is" + " "+name); 
	    String joined=name.concat(name1);
	    System.out.println(joined); 
	    reader.close();
	  }  
	}

	
	   


