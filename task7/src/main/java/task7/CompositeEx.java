package task7;

public class CompositeEx
{
	
		   public static void main(String[] args) {
		   
		      employee CEO = new employee("John","CEO", 30000);

		      employee headSales = new employee("Robert","Head Sales", 20000);

		      employee headMarketing = new employee("Michel","Head Marketing", 20000);

		      employee clerk1 = new employee("Laura","Marketing", 10000);
		      employee clerk2 = new employee("Bob","Marketing", 10000);

		      employee salesExecutive1 = new employee("Richard","Sales", 10000);
		      employee salesExecutive2 = new employee("Rob","Sales", 10000);

		      CEO.add(headSales);
		      CEO.add(headMarketing);

		      headSales.add(salesExecutive1);
		      headSales.add(salesExecutive2);

		      headMarketing.add(clerk1);
		      headMarketing.add(clerk2);

		      //print all employees of the organization
		      System.out.println(CEO); 
		      
		      for (employee headEmployee : CEO.getSubordinates()) {
		         System.out.println(headEmployee);
		         
		         for (employee employee : headEmployee.getSubordinates()) {
		            System.out.println(employee);
		         }
		      }		
		   }

}
