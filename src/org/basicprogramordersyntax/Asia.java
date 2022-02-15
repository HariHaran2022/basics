package org.basicprogramordersyntax;

public class Asia { //class name
	
	private void china() { //method name
		
		System.out.println("china is 1st populated");
	}
private void india() { //method name
	
	System.out.println("india is 2nd populated");
}
public static void main(String[] args) { // main method
	
// syntax here is : classname objectname = new classname();
	
	Asia a = new Asia(); //object creation
	
//syntax here is : object name . method name();
	
	a.china(); //object
	a.india(); //object
}
}

