package oopsconcept;

public class MountainTrain extends Train {
	String nature;
	String enginetype;
	private String size;
 public MountainTrain(int speed,int gear,String size){
	 super(gear,speed);
	 this.size=size;
	
}
 public String nature(String newnature)
 {
    return  nature = newnature;
 }
 @Override public String toString()
 {
     return (super.toString() + "\ntrain size is "
             + size);
 }
}
