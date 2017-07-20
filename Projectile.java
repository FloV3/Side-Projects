import java.util.Scanner;

// Only used with the scheduled timer

//import java.util.Timer;
//import java.util.TimerTask;

public class Projectile {
	
	// typically you want to make your attributes private
	private int distance;
	private long speed;
	private char projectile;

	public Projectile(long startSpeed, int startDistance, char startProjectile) {
		// good habit to use this. for attributes, even though not needed here 
		// as params have different names so no confusion
		this.speed = startSpeed;
		this.distance = startDistance;
		this.projectile = startProjectile;
	}
	
	public Projectile(char projectileType) {
		
		this.projectile = projectileType;
	}

	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public long getSpeed() {
		return this.speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

	public char getProjectile(){
		return this.projectile;
	}

	public void setProjectile(char projectile) {
		this.projectile = projectile;
	}
	
	public static void main(String[] args) {
		int counter = 0;
		char projectile = ' ';
		long speed = 0;
		int distance = 0;
		//	Also only used with the scheduled timer
		
//		Timer timer = new Timer();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter projectile type (1 character): ");
		projectile = input.next().charAt(0);

		do {
			System.out.print("Enter the speed of your projectile (in ms | min 15 | 40 < recommended < 100): ");
			speed = input.nextLong();
		}
		while(speed < 15);

		do {
			System.out.print("Enter the distance you want your projectile to \"Fly\" (max 125): ");
			distance = input.nextInt();
		}
		while(distance > 125);

		System.out.print("\nPOW ");
		
		Projectile projObj = new Projectile(speed, distance, projectile);

		try {
	        while (counter < distance) {
	            System.out.print(projObj.getProjectile() + " ");
	            counter++;
	            Thread.sleep(speed);
	        }
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		input.close();
		///////////////////////////////////////////////////////////////////////
		//	Can't get the timer to shut down after the distance is reached.	 //
		///////////////////////////////////////////////////////////////////////
		
//		timer.scheduleAtFixedRate(new TimerTask() {
//			@Override
//			public void run() {
//
//				System.out.print(projectile + " ");
//				counter++;
//			}
//		}, 0, speed);
		
		///////////////////////////////////////////////////////////////////////////////////////
		//	The version below can't handle fast speeds as well, but at least it can stop...	 //
		///////////////////////////////////////////////////////////////////////////////////////
		

	}
}

