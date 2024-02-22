package stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("Jatestck");
		li.add("Jitestll");
		li.add("Mackgghkhkffjf");
		li.add("Packewryhhgftestjhkhjlj");
		
		Optional<String> st = li.stream().reduce((a,b)->a.length()>b.length()?a:b);
		System.out.println(st.get());
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(20);
		l1.add(22);
		l1.add(25);
		l1.add(21);
		l1.add(43);
		l1.add(76);
		
		Optional<Integer> total = l1.stream().reduce((sum, i)-> sum+i);
		System.out.println(total.get());
		
		int total1 = l1.stream().reduce(0, (sum, i)-> sum+i);
		System.out.println(total1);
		
		int mult = l1.stream().reduce(1, (mul, i)->mul*i);
		System.out.println(mult);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add( new Employee(1,"Sahara", 20, 756, "CS", "Ohio","4545", "sahara@test.com", "test12345") );
		employees.add( new Employee(2,"Prafulla", 30, 1756, "CS", "Ohio","12345", "sahara@test.com", "test12345") );
		employees.add( new Employee(3,"Rahim", 40, 15675, "CS", "Ohio","8765", "sahara@test.com", "test12345") );
		employees.add( new Employee(4,"Arti", 50, 56756, "CIVIL", "Ohio","12356", "sahara@test.com", "test12345") );
		employees.add( new Employee(5,"Shahzad", 60, 56756, "CS", "Ohio","98763", "sahara@test.com", "test12345") );
		
		Comparator<Employee> ageSorting = (Employee e1, Employee e2)->e1.getName().compareTo(e2.getName());
		//Collections.sort(employees, ageSorting);
		//System.out.println(employees);
		
		employees.stream().sorted(ageSorting).forEach(System.out::println);
		
		
		
	}

}
