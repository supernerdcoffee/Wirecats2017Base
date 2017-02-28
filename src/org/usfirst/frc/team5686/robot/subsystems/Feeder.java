package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feeder extends Subsystem {
	public static CANTalon belt;
	
	private static final double BELT_SPEED = 0.5 ;

	public  Feeder() {
		super("Feeder");
		belt= new CANTalon(RobotMap.feeder);
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

