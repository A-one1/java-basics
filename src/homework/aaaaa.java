package homework;

import java.util.Arrays;

public class aaaaa {
	public static void main(String[] args) {
		
	
	String[] toppings = new String[3];

    toppings[0] = "Cheese";
    toppings[1] = "Pepperoni";
    toppings[2] = "Black Olives";
    
    Arrays.sort(toppings);
    for(String s : toppings) {
System.out.println(s);
    }
}
}