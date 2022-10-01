
class Main1 {
	boolean isOn;
	private void turnOnn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }
	public static void main(String[] args) {
     Main1 led1=new Main1();
     led1.turnOnn();
	    // create objects led and halogen
	    Lamp led = new Lamp();
	    Lamp halogen = new Lamp();

	    // turn on the light by
	    // calling method turnOn()
	    led.turnOn();

	    // turn off the light by
	    // calling method turnOff()
	    halogen.turnOff();
	  }
}
