import java.util.Scanner;

public class Constructor {
	
	int id;
	String name;
	String location;
	
	Constructor(int id) {
		this.id = id;
	}
	
	Constructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	Constructor(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("location: " + location);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Constructor emp1 = new Constructor(1);
		Constructor emp2 = new Constructor(2, "divya");
		Constructor emp3 = new Constructor(3, "shruti", "kalyan");
		emp1.showInfo();
		emp2.showInfo();
		emp3.showInfo();
		
	}
}



/*
output
D:\anudip>javac Constructor.java

D:\anudip>java Constructor
ID: 1
Name: null
location: null

ID: 2
Name: divya
location: null

ID: 3
Name: shruti
location: kalyan

*/