package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;
import org.usfirst.frc.team5686.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The robot's drivetrain
 */
public class DriveTrain extends Subsystem {
	private static RobotDrive drive;
	
	private Talon rightFront;
	private Talon rightRear;
	private Talon leftFront;
	private Talon leftRear;
	
	// tune these to adjust it so the joysticks act the same
	private static final double BIAS_MULTIPLIER_RIGHT = 1;
	private static final double BIAS_MULTIPLIER_LEFT = 1;
	
	private static final double BIAS_MULTIPLIER_RIGHT_SLOW  = .3;
	private static final double BIAS_MULTIPLIER_LEFT_SLOW = .3;
	
	public DriveTrain(){
		super("DriveTrain");
		
		rightFront = new Talon(RobotMap.rightFrontDrive);
		rightRear = new Talon(RobotMap.rightRearDrive);
		leftFront = new Talon(RobotMap.leftFrontDrive);
		leftRear = new Talon(RobotMap.leftRearDrive);
		
		drive = new RobotDrive(leftFront, leftRear, rightFront, rightRear);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}
	
	public void arcadeDrive(double x, double y){
		drive.arcadeDrive(x, y);
	}
	
	public void drive(double left, double right){
		drive.tankDrive(left * BIAS_MULTIPLIER_LEFT, right * BIAS_MULTIPLIER_RIGHT);
	}
	
	public void slowDrive(double left, double right){
		drive.tankDrive(left * BIAS_MULTIPLIER_LEFT_SLOW, right * BIAS_MULTIPLIER_RIGHT_SLOW);
	}
	
	public void stop() {
		drive.drive(0, 0);
	}
}

