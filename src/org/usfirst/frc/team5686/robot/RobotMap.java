package org.usfirst.frc.team5686.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// drive train pwm ports
	public static int rightFrontDrive = 9;
	public static int rightRearDrive = 1;
	public static int leftFrontDrive = 2;
	public static int leftRearDrive = 3;
	
	
    
	// intake CAN ID
	public static int intake = 4;
	public static int shooter=5;
	public static int feeder=6;
	public static int gear=7;
	
	//scale pwm
	//public static int scale_a = 10;
	//public static int scale_b = 11;
	public static int scale = 8;
	//public static int scale_b = 32;
	}
