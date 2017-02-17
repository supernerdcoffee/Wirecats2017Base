package org.usfirst.frc.team5686.robot.commands;

import org.usfirst.frc.team5686.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Control the scaling mechanism
 */
public class RunScale extends Command {

    public RunScale() {
        requires(Robot.scale);
        
        setInterruptible(true);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// negate the axis value since down is positive, and we want down to be negative
    	Robot.scale.runScale();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.scale.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
