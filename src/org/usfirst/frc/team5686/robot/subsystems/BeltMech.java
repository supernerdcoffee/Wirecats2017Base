package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BeltMech extends Subsystem {
	public static CANTalon belt;
	
	private static final double BELT_SPEED = 0.5 ;

	public  BeltMech() {
		super("BeltMech");
		belt= new CANTalon(RobotMap.belt);
	}
	
	public void beltsOn() {
		belt.set(BELT_SPEED);
	}
	
	public void stop () {
		belt.set(0);
	}
   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

