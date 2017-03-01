package org.usfirst.frc.team5686.robot;


import org.usfirst.frc.team5686.robot.subsystems.Scale;
import org.usfirst.frc.team5686.robot.triggers.IntakeInPOV;
import org.usfirst.frc.team5686.robot.triggers.IntakeOutPOV;
import org.usfirst.frc.team5686.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);\
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	// joysticks
	Joystick js1;
	Joystick js2;
	Joystick js3;
	
	Trigger intakeIn;
	Trigger intakeOut;
	Trigger cancelIntake;
	JoystickButton shooter;
	JoystickButton feeder;
	
	JoystickButton downScale;
	JoystickButton startScale;
	
	JoystickButton startScale2;
	
	JoystickButton arcadeDrive;
	JoystickButton arcadeDrive2;
	
	JoystickButton tankDrive;
	JoystickButton tankDrive2;
	JoystickButton tankDrive3;
	JoystickButton tankDrive4;
	
	JoystickButton slowDrive;
	JoystickButton slowDrive2;
	
	
	public OI(){
		// init joysticks
		js1 = new Joystick(0);
		js2 = new Joystick(1);
		js3 = new Joystick(2);
		
		// set up buttons
		// 5 feeder 6 shooter
		intakeIn = new JoystickButton(js3, 3);
		intakeOut = new JoystickButton(js3, 4);
		shooter = new JoystickButton(js3, 6);
		feeder = new JoystickButton(js3, 5);
		
		cancelIntake = new JoystickButton(js3, 2);
		cancelIntake.whenActive(new IntakeCancel());
		
		
		
		////downScale = new JoystickButton(js3,1);
		//downScale.toggleWhenActive(new DownScale());
		
		

		startScale = new JoystickButton(js3,4);
		startScale.toggleWhenActive(new RunScale());
		
		//arcadeDrive = new JoystickButton(js1, 8);
		//arcadeDrive2 = new JoystickButton(js2, 8);
		
		tankDrive = new JoystickButton(js1, 9);
		tankDrive2 = new JoystickButton(js2, 9);
		tankDrive3 = new JoystickButton(js1, 4);
		tankDrive4 = new JoystickButton(js2, 4);
		
		slowDrive = new JoystickButton(js1, 3);
		slowDrive2 = new JoystickButton(js2, 3);
		
		
		// toggles because when this command is toggled off it defaults to tank
		//arcadeDrive.whenPressed(new ArcadeDrive());
		//arcadeDrive2.whenPressed(new ArcadeDrive());
		
		tankDrive.whenPressed(new TankDrive());
		tankDrive2.whenPressed(new TankDrive());
		tankDrive3.whenPressed(new TankDrive());
		tankDrive4.whenPressed(new TankDrive());
		shooter.whenPressed(new PrimeShooter());
		feeder.whenPressed(new FireShooter());
		
		//slowDrive.whenPressed(new SlowDrive());
		//slowDrive2.whenPressed(new SlowDrive());
	}
	
	public void setUpIntakeTriggers(){
		// intake POV controls
		intakeIn = new IntakeInPOV();
		intakeIn.whenActive(new IntakeIn());

		intakeOut = new IntakeOutPOV();
		intakeOut.whenActive(new IntakeOut());
		
		
		
		
	}
	
	public Joystick getLeft(){
		return js1;
	}
	
	public Joystick getRight(){
		return js2;
	}
	
	public Joystick getXboxController(){
		return js3;
	}
}

