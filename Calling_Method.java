public class Calling_Method {

	void Area(int pincode) {
		System.out.println(pincode);
	}
	void Area(int pincode, String police_s) {
		System.out.println(pincode);
		System.out.println(police_s);
	}
	void Area(int pincode, String police_s, String city) {
		System.out.println(pincode);
		System.out.println(police_s);
		System.out.println(city);
	}	

	public static void main(String[] args) {
		
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.print("Enter number of data: ");
		int num_data = scan.nextInt();
		
		Calling_Method cm1 = new Calling_Method();
		
		switch(num_data) {
			case 1:
				
				cm1.Area(421301);
				break;
			case 2:
				
				cm1.Area(421301, "khadakpada Police Station");
				break;
			case 3:
				
				cm1.Area(421301, "khadakpada Police Station", "Kalyan");
				break;
			default: 
				System.out.print("Invalid Input");
		}
	}
}



/*

D:\anudip>java Calling_Method
Enter number of data: 3
421301
khadakpada Police Station
Kalyan

*/