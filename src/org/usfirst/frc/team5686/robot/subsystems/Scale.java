package org.usfirst.frc.team5686.robot.subsystems;
import org.usfirst.frc.team5686.robot.RobotMap;
import org.usfirst.frc.team5686.robot.commands.RunScale;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The robot's scaling mechanism
 */
public class Scale extends Subsystem {
	
	private static final double SCALE_UP_SPEED = 0.30;
	
	private static final double SCALE_DOWN_SPEED = -1;
	

	

	
	private static Talon scale_motor_a;
	private static Talon scale_motor_b;

	public Scale(){
		super("Scale");
		
		 scale_motor_a = new Talon(RobotMap.scale_a);
		 scale_motor_b = new Talon(RobotMap.scale_b);
		 
		
		
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new RunScale());
	}
	
	

	public void stop(){
		scale_motor_a.set(0);
		scale_motor_b.set(0);
	}

	
	
	

	public void downScale() {
		scale_motor_b.set(SCALE_DOWN_SPEED);
		
	}

	public void runScale() { 
		scale_motor_a.set(SCALE_UP_SPEED);
		
	}


		
	}
