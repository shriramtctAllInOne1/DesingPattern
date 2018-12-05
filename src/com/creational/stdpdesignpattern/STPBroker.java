package com.creational.stdpdesignpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.core.util.SerializationDeserializationUtil;

// SingleTone design can be broken by cloning,serialization and reflection
public class STPBroker {

	/**
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static void stdpReflectionEx() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerInitializationstp eagerObj1 = EagerInitializationstp.getInstance();
		EagerInitializationstp eagerObj2 = null;
		@SuppressWarnings("unchecked")
		Constructor<EagerInitializationstp>[] constructor = (Constructor<EagerInitializationstp>[]) EagerInitializationstp.class
				.getDeclaredConstructors();
		for (Constructor<EagerInitializationstp> obj : constructor) {
			obj.setAccessible(true);
			eagerObj2 = obj.newInstance();
		}

		System.out.println("First object hashCode :" + eagerObj1.hashCode());
		System.out.println("First object hashCode : " + eagerObj2.hashCode());
	}

	public static void stdpcloning() throws CloneNotSupportedException {
		STPCloningEx obj = STPCloningEx.getInstance();
		STPCloningEx obj1 = (STPCloningEx) obj.clone();
		System.out.println("First object hashCode :" + obj.hashCode());
		System.out.println("First object hashCode : " + obj1.hashCode());
	}

	public static void stdpEnum() {
		SingletonEnum enumObj = SingletonEnum.INSTANCE;
		int i = enumObj.getValue();
		System.out.println(i);
		enumObj.setValue(2);
		int j = enumObj.getValue();
		System.out.println(j);
	}
	
	public static void stdpSerialization(){
		EagerInitializationstp eagerObj1 = EagerInitializationstp.getInstance();
		SerializationDeserializationUtil.serialize(eagerObj1);
		EagerInitializationstp eagerObj2 =(EagerInitializationstp) SerializationDeserializationUtil.deserialize();
		System.out.println("First object hashCode :" + eagerObj1.hashCode());
		System.out.println("Second object hashCode : " + eagerObj2.hashCode());
	}
  public static void stdpinheritance(){
	  ParentSingleton pobj= ParentSingleton.getInstance();
	  ParentSingleton cObj= ChildSingleton.getInstance();
	  System.out.println("Parent obj--: "+pobj.hashCode());
	  System.out.println("child obj--: "+cObj.hashCode());
  }
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		// stdpReflectionEx();
		// stdpcloning();
		// stdpEnum();
		//stdpSerialization();
		stdpinheritance();
	}
}
