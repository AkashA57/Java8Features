package func.Interface;

@FunctionalInterface
public interface FunctionalInterface1 {
	
	/* can have only 1 unimplemented method but it can have multple default and 
	static method */
	
	public void print(String str);
	
	default void printing(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
	}
	
	default void printing(String str1) {
		System.out.println(str1);
	}
	
	static void printable(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
	}
	
	static void printable(String str1) {
		System.out.println(str1);
	}

}
