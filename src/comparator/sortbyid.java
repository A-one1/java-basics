package comparator;
import java.util.Comparator;

class Sortbyid implements Comparator<Employee> 
{ 
    
    public int compare(Employee a, Employee b) 
    { 
        return b.employeeid - a.employeeid; 
    } 
} 