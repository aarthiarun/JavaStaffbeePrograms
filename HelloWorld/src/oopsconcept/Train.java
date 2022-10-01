package oopsconcept;

public class Train {
	int speed;
	int gear;
Train(int speed,int gear){
	this.speed=speed;
	this.gear=gear;
	}
	
public String toString()
{
    return ("No of gears are " + gear + "\n"
            + "speed of Train is " + speed+ "Kmph");
}

}
