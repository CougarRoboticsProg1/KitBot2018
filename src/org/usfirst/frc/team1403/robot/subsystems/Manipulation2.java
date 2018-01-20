package org.usfirst.frc.team1403.robot.subsystems;

import org.usfirst.frc.team1403.robot.commands.RollersWithJoystick;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulation2 extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Victor rightRollers, leftRollers;
	
	public Manipulation2() {
		rightRollers = new Victor(4);
		leftRollers = new Victor(7);
	}
	public void manipulate(double leftRoll, double rightRoll) {
		rightRollers.set(rightRoll);
		leftRollers.set(leftRoll);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RollersWithJoystick());
    }
}

