/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1403.robot;





import org.usfirst.frc.team1403.robot.commands.Eject;
import org.usfirst.frc.team1403.robot.commands.Intake;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	
	// You create one by telling it which joystick it's on and which button
	// number it is.
	public Joystick djoy = new Joystick(0);
	public Joystick ojoy = new Joystick(1);
	
	
	
	Button aojoy = new JoystickButton(ojoy,1);
	Button bojoy = new JoystickButton(ojoy,2);
	Button xojoy = new JoystickButton(ojoy,3);
	Button yojoy = new JoystickButton(ojoy,4);
	Button lbojoy = new JoystickButton(ojoy,5);
	Button rbojoy = new JoystickButton(ojoy,6);
	Button startojoy = new JoystickButton(ojoy,8);
	
	Button adjoy = new JoystickButton(djoy,1);
	Button bdjoy = new JoystickButton(djoy,2);
	Button xdjoy = new JoystickButton(djoy,3);
	Button ydjoy = new JoystickButton(djoy,4);
	Button lbdjoy = new JoystickButton(djoy,5);
	Button rbdjoy = new JoystickButton(djoy,6);
	Button startdjoy = new JoystickButton(djoy,8);
	
	
	public OI() {
	/*	xojoy.whileHeld(new Intake());
		aojoy.whileHeld(new Eject());
	*/
	
	}
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
