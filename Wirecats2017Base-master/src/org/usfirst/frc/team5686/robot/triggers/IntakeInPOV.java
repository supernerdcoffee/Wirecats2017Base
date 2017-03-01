package org.usfirst.frc.team5686.robot.triggers;

import org.usfirst.frc.team5686.robot.Robot;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class IntakeInPOV extends Trigger {
    
    public boolean get() {
        return Robot.oi.getXboxController().getPOV() == 180;
    }
}
