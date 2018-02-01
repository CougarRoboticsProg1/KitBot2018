package org.usfirst.frc.team1403.robot.subsystems;



import org.usfirst.frc.team1403.robot.RobotMap;
import org.usfirst.frc.team1403.robot.commands.ControlRollers;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Victor rightRollers, leftRollers;
	
	public Intake() {
		rightRollers = new Victor(RobotMap.rightRollersPort);
		leftRollers = new Victor(RobotMap.leftRollersPort);
	}
	public void manipulate(double leftRoll, double rightRoll) {
		rightRollers.set(rightRoll);
		leftRollers.set(leftRoll);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
      setDefaultCommand(new ControlRollers());
    }
}