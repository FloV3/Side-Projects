import java.util.Scanner;

public class Driver {

	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		boolean b = true;
		int call = 0;
		int floor1 = 0;
		int floor2 = 0;
		int destination = 0;
		int destination1 = 0;
		int destination2 = 0;
		String number1 = "One";
		String number2 = "Two";
		String caller = "Enter an integer (which represents your floor) to call an elevator to you: ";
		String goer = "Enter an integer to set a destination floor: ";
		
		//There are two Elevators in the building
		Elevator elevObj1 = new Elevator (floor1, destination1, number1);
		Elevator elevObj2 = new Elevator (floor1, destination1, number2);
		
		do {
			System.out.print(caller);
			call = input.nextInt ();
			
			if (Math.abs(floor1 - call) <= Math.abs(floor2 - call)) {
				floor1 = call;
				elevObj1.setFloor(floor1);
			}
			else {
				floor2 = call;
				elevObj2.setFloor(floor2);
			}
			System.out.print(goer);
			destination = input.nextInt ();
			
			if (call == floor1) {
				destination1 = destination;
				elevObj1.setDestination(destination1);
				//Assuming that the elevator has travel time...
				floor1 = destination;
				System.out.println("You have reached floor " + destination + " in Elevator number " + number1);
			}
			else {
				destination2 = destination;
				elevObj2.setDestination(destination2);
				//Assuming that the elevator has travel time...
				floor2 = destination;
				System.out.println("You have reached floor " + destination + " in Elevator number " + number2);
			}
			System.out.println(" ");
		}
		while (b == true);	//FIX THIS LATER		
		
		input.close();
	}
}