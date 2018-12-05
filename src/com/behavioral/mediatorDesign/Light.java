package com.behavioral.mediatorDesign;

import org.omg.PortableServer.POAManagerPackage.State;

public class Light {

	private String color;
	private State currentState;
	private LightSignalMediator lightMediator;

	public enum State {
		on, off;
	}

	public Light(String color, LightSignalMediator lightMediator) {
		super();
		this.color = color;
		this.lightMediator = lightMediator;
		lightMediator.registerList(this);
	}

	public void turnOff() {
		currentState = State.off;
        System.out.printf("%s is turned %s \n", this, currentState.off);
	}

	public void turnOn() {
		currentState = State.on;
		lightMediator.notifyMediator(this);
        System.out.printf("%s is turned %s \n", this, currentState.on);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Light other = (Light) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Light [color=" + color + "]";
	}
	
	

}
