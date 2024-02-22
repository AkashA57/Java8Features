package method.reference;

public class Area {
	
	public  void test() {
		System.out.println("method not taking any param");
	}
	
	public  int test(int i) {
		System.out.println("Test 2 example");
		return i*i;
	}
	
	public static int test(int i,int j) {
		System.out.println("Test 3 example");
		return i+j;
	}
	
	public static int test(int i,int j, int k) {
		System.out.println("Test 4 example");
		return i*j*k;
	}

}
