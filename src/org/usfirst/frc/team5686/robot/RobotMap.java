package org.usfirst.frc.team5686.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// drive train pwm ports
	public static int rightFrontDrive = 0;
	public static int rightRearDrive = 1;
	public static int leftFrontDrive = 2;
	public static int leftRearDrive = 3;
	
	// arm pwm ports
	public static int arm_a = 4;
	public static int arm_b = 5;
	
	// arm limit switches
	public static int arm_down = 9;
	public static int arm_up = 8;
	
	// ball detection switch
	public static int ball_switch = 7;
    
	// intake CAN ID
	public static int intake = 0;
	
	
	//scale pwm
	//public static int scale_a = 10;
	//public static int scale_b = 11;
	public static int scale_a = 7;
	public static int scale_b = 6;
	}
