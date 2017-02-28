package org.usfirst.frc.team5686.robot.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;


import org.usfirst.frc.team5686.robot.RobotMap;

/**
 * The intake system
 */
public class IntakeWheels extends Subsystem {
	private static DigitalInput limit_switch;
	private static CANTalon intake;
	
	private static final double INTAKE_SPEED = 1.0;
	private static final double INTAKE_OUT_SPEED = -1.0;

	public IntakeWheels(){
		super("IntakeWheels");
		
		intake = new CANTalon(RobotMap.intake);
		
	//	limit_switch = new DigitalInput(RobotMap.ball_switch);
	}
	
	public void initDefaultCommand() {
		//setDefaultCommand(new MySpecialCommand());
	}
	
	public boolean getBallSwitch(){
		return !limit_switch.get();
	}

	public void intakeIn() {
		// if the limit switch is pressed, don't allow intake
		if(!limit_switch.get()){
			intake.set(0);
		}else{
			intake.set(INTAKE_OUT_SPEED);
		}
	}
	
	public void intakeOut() {
		intake.set(INTAKE_SPEED);
	}

	public void stop (){
		intake.set(0);
	}
}