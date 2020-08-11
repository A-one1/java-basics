package comparator;
import java.util.Comparator;

class Sortbyname implements Comparator<Employee> 
	{ 
	    
	    public int compare(Employee a, Employee b) 
	    { 
	        return b.name.compareTo(a.name); 
	    } 
	} 
