package org.usfirst.frc.team5686.robot.subsystems;
import org.usfirst.frc.team5686.robot.RobotMap;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The robot's arm
 
public class Arm extends Subsystem {
	private static DigitalInput down;
	private static DigitalInput up;
	
	private static Talon arm_motor_a;
	private static Talon arm_motor_b;

	public Arm(){
		super("Arm");
		
	//	arm_motor_a = new Talon(RobotMap.arm_a);
	//	arm_motor_b = new Talon(RobotMap.arm_b);
	//	
	//	down = new DigitalInput(RobotMap.arm_down);
	//	up = new DigitalInput(RobotMap.arm_up);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new RunArm());
	}
	
	public void set(double speed){
		if(getUpSwitch() && speed < 0){
			setBoth(0);
		}else if(getDownSwitch() && speed > 0){
			setBoth(0);
		}else{
			speed *= 0.3;
			
			setBoth(speed);
		}
	}
		
	private void setBoth(double speed){
		arm_motor_a.set(speed);
		arm_motor_b.set(speed);
	}
	
	private boolean getDownSwitch(){
		return !down.get();
	}
	
	private boolean getUpSwitch(){
		return !up.get();
	}

	public void stop(){
		set(0);
	}
}
*/