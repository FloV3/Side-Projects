package myHugePackage;

import java.util.Scanner;

//	Only used with the scheduled timer

//import java.util.Timer;
//import java.util.TimerTask;

public class Projectile {
	
	static int distance, counter = 0;
	static long speed;
	static char projectile;
	
	public Projectile(int startSpeed, int startDistance) {
		
		speed = startSpeed;
		distance = startDistance;
	}
	
	public Projectile(char projectileType) {
		
		projectile = projectileType;
	}
	
	public static void main(String[] args) {

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
		
		try {
	        while (counter < distance) {
	            System.out.print(projectile + " ");
	            counter++;
	            Thread.sleep(speed);
	        }
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		input.close();
	}
}

