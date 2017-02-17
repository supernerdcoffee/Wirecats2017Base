package org.usfirst.frc.team5686.robot.commands;

import org.usfirst.frc.team5686.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SlowDrive extends Command {

    public SlowDrive() {
        requires(Robot.drivetrain);
        
        setInterruptible(true);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.slowDrive(-Robot.oi.getLeft().getY(), -Robot.oi.getRight().getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {}

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
