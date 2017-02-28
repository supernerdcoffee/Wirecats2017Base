package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feeder extends Subsystem {
	public static CANTalon feeder;
	
	private static final double FEEDER_SPEED = 0.5 ;

	public  Feeder() {
		super("Feeder");
		feeder= new CANTalon(RobotMap.feeder);
	}
	
	public void feederOn() {
		feeder.set(FEEDER_SPEED);
	}
	
	public void stop () {
		feeder.set(0);
	}
   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

