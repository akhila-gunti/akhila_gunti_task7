package task7;


	import java.util.ArrayList;
	import java.util.List;

	public class employee {
	   private String name;
	   private String dept;
	   private int salary;
	   private List<employee> subordinates;

	   // constructor
	   public employee(String name,String dept, int sal) {
	      this.name = name;
	      this.dept = dept;
	      this.salary = sal;
	      subordinates = new ArrayList<employee>();
	   }

	   public void add(employee e) {
	      subordinates.add(e);
	   }

	   public void remove(employee e) {
	      subordinates.remove(e);
	   }

	   public List<employee> getSubordinates(){
	     return subordinates;
	   }

	   public String toString(){
	      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
	   }   
	}


