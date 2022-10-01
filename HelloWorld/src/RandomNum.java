
import java.util.Random;
class RandomNum {
    public static void main( String args[] ) {
    	int bucket0=0;
    	int bucket1=0;
        int bucket2=0;
        int bucket3=0;
        int bucket4=0;
     for(int i=0;i<200;i++) { 
    	 Random rand = new Random(); //instance of random class
      int upperbound = 100;
        //generate random values from 0-100
      int int_random = rand.nextInt(upperbound); 
      if(int_random>0&& int_random<20) {
    	  bucket0+=1;
      }else if(int_random>=20&& int_random<40) {
    	  bucket1+=1;
      }else if(int_random>40 && int_random<60) {
    	  bucket2+=1;
      }else if(int_random>60 && int_random<80) {
    	  bucket3+=1;
      }
      else
    	  bucket4+=1;
      }
      System.out.println("Frequencies of random numbers bucket0 is  "+ bucket0 +"    bucket1 is   "+ bucket1 +"   bucket2   "+ bucket2 +"  bucket3  "+ bucket3   +"   bucket4    "+ bucket4);
    }}