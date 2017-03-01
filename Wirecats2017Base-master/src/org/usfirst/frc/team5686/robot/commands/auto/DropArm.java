package org.usfirst.frc.team5686.robot.commands.auto;

import org.usfirst.frc.team5686.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *

public class DropArm extends Command {

    public DropArm() {
        requires(Robot.arm);
        
        setTimeout(0.25);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.arm.set(1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    	
    }
}
 */