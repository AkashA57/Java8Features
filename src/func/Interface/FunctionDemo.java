package func.Interface;

import java.util.function.Consumer;

public class FunctionDemo {

	public static void main(String[] args) {
		
		/*
		FunctionalInterface1 func = new FunctionalInterface1() {

			@Override
			public void print(String str) {
				System.out.println(str);
			}
		}; */
		
		//FunctionalInterface1 func = (String str) -> System.out.println("Hello " + str);
		//FunctionalInterface1 func = (str) -> System.out.println("Hello " + str);
		FunctionalInterface1 func = t -> System.out.println("Hello " + t);
		
		//Lambda -> ()
		func.print("Java8");
		func.printing("test");
		FunctionalInterface1.printable("test1", "test2");
		
		/* Func2 func2 = new Func2() {
			@Override
			public int add(int a, int b) {
				System.out.println(a);
				System.out.println(b);
				return a+b;
			}
		}; */
		Func2 func2 = (a, b) ->
			{System.out.println(a);
			System.out.println(b);
			return a+b;
		};
		
		func2.add(2, 3);
		func2.add(7, 8);
		
		Consumer c = a -> System.out.println("consumer implementation -----" + a);
		c.accept(3);
		c.accept("java");
		c.accept(1.22);
		
		Employee emp = new Employee(1, "jack", 23, "civil", 4567, "NJ");
		c.accept(emp);
		



	}

}
