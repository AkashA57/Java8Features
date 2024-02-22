package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
	//Stream doesn't store the data 
	//works on functional interfaces and Lambda 
	//cannot modify data from stream 
	// intermediate operation and terminal operation 
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("Jatestck");
		li.add("Jitestll");
		li.add("Mackgghkhkffjf");
		li.add("Packewryhhgftestjhkhjlj");
		
		for(String str:li) {
			if(str.length()>10) {
				if(str.contains("test")) {
					System.out.println(str);
				}
			}
		}
		System.out.println("Below is the Stream implementation");
		
		li.stream().filter(t -> t.length()>10).filter(t -> t.contains("test")).forEach(t -> System.out.println(t));
		
		li.stream().map(str -> str.length()).filter(l -> l>10).forEach(t -> System.out.println(t));
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add( new Employee(1,"Sahara", 20, 756, "CS", "Ohio","4545", "sahara@test.com", "test12345") );
		employees.add( new Employee(2,"Prafulla", 30, 1756, "CS", "Ohio","12345", "sahara@test.com", "test12345") );
		employees.add( new Employee(3,"Rahim", 40, 15675, "CS", "Ohio","8765", "sahara@test.com", "test12345") );
		employees.add( new Employee(4,"Arti", 50, 56756, "CIVIL", "Ohio","12356", "sahara@test.com", "test12345") );
		employees.add( new Employee(5,"Shahzad", 60, 56756, "CS", "Ohio","98763", "sahara@test.com", "test12345") );
		
		employees.stream().filter(emp->emp.getSalary()>1000).filter(emp->emp.getDepartment().equals("CS")).forEach(t->System.out.println(t.getName()));
		
		//employees.stream().sorted();
		long c = employees.stream().filter(t->t.getAge()>30).filter(t->t.getDepartment().equals("CS")).count();
		System.out.println("count of age > 30 --- " + c);
		
		List<Employee> emp = employees.stream().filter(t->t.getAge()>30).filter(t->t.getDepartment().equals("CS")).collect(Collectors.toList());
		emp.stream().forEach(System.out::println);
		//System.out.println(emp);
		
		Function<Employee, Integer> f = t->t.getId();
		Map<Integer, String> m = employees.stream().filter(t->t.getName().startsWith("S")).
									collect(Collectors.toMap(t->t.getId(), t->t.getName()));
		System.out.println(m);
	}

}
