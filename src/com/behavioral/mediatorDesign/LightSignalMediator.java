package com.behavioral.mediatorDesign;

import java.util.HashSet;

public class LightSignalMediator {

	HashSet<Light> trafficSignal = new HashSet<Light>();

	public void registerList(Light light) {
		trafficSignal.add(light);
	}

	public void removeLight(Light light) {
		trafficSignal.remove(light);
	}

	public void turnOffAllLight(Light light) {
		for (Light lightObj : trafficSignal) {
			if (!light.equals(lightObj)) {
				lightObj.turnOff();
			}
		}
	}
	public void notifyMediator(Light light) {
		turnOffAllLight(light);
	}

}
