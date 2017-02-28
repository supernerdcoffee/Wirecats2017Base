package org.usfirst.frc.team5686.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5686.robot.Robot;
import org.usfirst.frc.team5686.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ShooterMech extends Subsystem {
	private static CANTalon shooter;
	
	private static final double SHOOTER_SPEED = 0.75;
	
	public ShooterMech() {
		super ("ShooterMech");
		shooter = new CANTalon(RobotMap.shooter);
	}
		
	public void FireShooter() {
		shooter.set(SHOOTER_SPEED);
		
	}
	
	public void StopShooter() {
		shooter.set(0);
	}
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

