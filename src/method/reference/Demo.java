package method.reference;

import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		
		Area ar =new Area();
		
		Func1 f = ar::test; //Reference of instance method->Reference of non static method
		f.print();
		
		Consumer<Integer> c = Demo::myPrint;
		c.accept(4);
		
		Function<Integer, Integer> f1 = ar::test;
		
	}
	
	public static void myPrint(int i) {
		System.out.println("this is my print method " + i);
	}

}
