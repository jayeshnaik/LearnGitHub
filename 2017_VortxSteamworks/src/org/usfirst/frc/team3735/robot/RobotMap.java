package org.usfirst.frc.team3735.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 */
public class RobotMap {
	
	public final class DEBUGPRINT {
    	//// This will allow you to turn debug print on and off
		// Example Use:
		// if (RobotMap.DEBUGPRINT.ON){
    	//	System.out.println(" CMDSETSPEED:" + speedvalue);
    	// }
		////
		public static final boolean ON = true; /* Set to False During Match */
	} 
	
	
	// Driver Controls
	public static class DRIVER {
		public static int DriverPort = 0;
		public static int Joystick = 1;
	}

	// Co Driver Controls
	public static class CODRIVER {
		public static int CoDriverPort = 1;
		public static int Joystick = 2;
	}
	
	public static class CAN {
		public static int leftDrive1  		= 1;
		public static int leftDrive2  		= 2;
		public static int leftDrive3  		= 3;
		
		public static int rightDrive1 		= 4;
		public static int rightDrive2 		= 5;
		public static int rightDrive3 		= 6;
		
		public static int intakeSpinner 	= 23;
		public static int shootSpinner 		= 24;
				
		public static int backGearSpinner  	= 25;
		public static int frontGearSpinner 	= 26;
		
		public static int scalermotor 		= 27;
		
	
	}
	
	public static class SOLENOID {
		public static int sGearHumanIntake	= 0;
		public static int sLiftGear			= 1;
		public static int s3notused		  	= 2;
		public static int s4notused			= 3;
		public static int s5notused 		= 4;
		public static int s6notused			= 5;
		public static int s7notused		  	= 6;
		public static int s8notused			= 7;
		

	}
	
	public static class PREFERENCE {
		public static final String ShootSpeed = "ShootSpeed";
	
	}
	
	public static class SWITCHES {
		public static int gear_lim;
	}

	

}
