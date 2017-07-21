public class Elevator {

	private int floor;
	private int destination;
	
	public Elevator (int currentFloor, int destination, String number) {
		
		this.floor = currentFloor;
		this.destination = destination;
	}
	
	public int getFloor () {
		return this.floor;
	}
	
	public void setFloor (int floor) {
		this.floor = floor;
	}
	
	public int getDestination () {
		return this.destination;
	}
	
	public void setDestination (int destination) {
		this.destination = destination;
	}
}
