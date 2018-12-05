package com.creational.stdpdesignpattern;

// SingleTone design used when we need one single object accross application
// loading configuration file 
// connectionPool
public class MainApp {
	
	public static void main(String [] args){
		//eagerSingleToneTest();
		//lazyInitalizationstpTest();
		//staticBlockInitalizationstptest();
		//threadSafestptest();
		billPughstptest();
	}
	
	public static void eagerSingleToneTest(){
		EagerInitializationstp obj1 = EagerInitializationstp.getInstance();
		EagerInitializationstp obj2 = EagerInitializationstp.getInstance();
		System.out.println("Object Obj1 hashCode : "+obj1.hashCode()+"----Object Obj2 hashCode : "+obj2.hashCode());
	}

	public static void lazyInitalizationstpTest(){
		LazyInitalizationstp obj1 = LazyInitalizationstp.getInstance();
		LazyInitalizationstp obj2 = LazyInitalizationstp.getInstance();
		System.out.println("Object Obj1 hashCode : "+obj1.hashCode()+"----Object Obj2 hashCode : "+obj2.hashCode());

	}
	
	public static void staticBlockInitalizationstptest(){
		StaticBlockInitalizationstp obj1=  StaticBlockInitalizationstp.getInstance();
		StaticBlockInitalizationstp obj2=  StaticBlockInitalizationstp.getInstance();
		System.out.println("Object Obj1 hashCode : "+obj1.hashCode()+"----Object Obj2 hashCode : "+obj2.hashCode());
	}
	
	public static void threadSafestptest(){
		ThreadSafestp obj1=  ThreadSafestp.getInstance();
		ThreadSafestp obj2=  ThreadSafestp.getInstance();
		System.out.println("Object Obj1 hashCode : "+obj1.hashCode()+"----Object Obj2 hashCode : "+obj2.hashCode());
	}
	
	public static void billPughstptest(){
		BillPughstp obj1=  BillPughstp.getInstance();
		BillPughstp obj2=  BillPughstp.getInstance();
		System.out.println("Object Obj1 hashCode : "+obj1.hashCode()+"----Object Obj2 hashCode : "+obj2.hashCode());
	}
}
