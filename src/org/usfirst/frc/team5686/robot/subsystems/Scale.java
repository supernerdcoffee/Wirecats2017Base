package org.usfirst.frc.team5686.robot.subsystems;
import org.usfirst.frc.team5686.robot.RobotMap;
import org.usfirst.frc.team5686.robot.commands.RunScale;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The robot's scaling mechanism
 */
public class Scale extends Subsystem {
	
	private static final double SCALE_UP_SPEED = 0.30;
	
	private static final double SCALE_DOWN_SPEED = -1;
	

	

	
	private static CANTalon scale_motor;

	public Scale(){
		super("Scale");
		
		 scale_motor = new CANTalon(RobotMap.scale);
		
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new RunScale());
	}
	
	

	public void stop(){
		scale_motor.set(0);
	}

	
	
	

	public void downScale() {
		scale_motor.set(SCALE_DOWN_SPEED);
		
	}

	public void runScale() { 
		scale_motor.set(SCALE_UP_SPEED);
		
	}


		
	}
