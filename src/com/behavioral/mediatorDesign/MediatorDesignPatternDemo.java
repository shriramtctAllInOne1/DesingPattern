package com.behavioral.mediatorDesign;

public class MediatorDesignPatternDemo {

	public static void main(String[] args) {

		LightSignalMediator lightMediator = new LightSignalMediator();
		Light red = new Light("Red", lightMediator);
		Light green = new Light("Green", lightMediator);
		Light yellow = new Light("Yellow", lightMediator);
		red.turnOn();
		green.turnOn();
		yellow.turnOn();

	}

}
