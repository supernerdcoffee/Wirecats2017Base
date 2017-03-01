package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMech extends Subsystem {
	private static CANTalon intake;
	

	private static final double INTAKE_SPEED = 1.0;
	
	public IntakeMech(){
		super("IntakeMech");
		
		intake = new CANTalon(RobotMap.intake);
		
	}
	public void intakeIn() {
		intake.set(INTAKE_SPEED);
	}
	
	public void stop () {
		intake.set(0);
	}
	public void intakeOut(){
		intake.set(-INTAKE_SPEED);
	}
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

