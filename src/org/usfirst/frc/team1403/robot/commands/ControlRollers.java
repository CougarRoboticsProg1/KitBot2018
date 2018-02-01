package org.usfirst.frc.team1403.robot.commands;

import org.usfirst.frc.team1403.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ControlRollers extends Command {
    
	public static double rollerSpeed;
	
    public ControlRollers() {
        // Use requires() here to declare subsystem dependencies
    	rollerSpeed = 0.5;
         
    	requires(Robot.intake);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    		
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        	
    	if(Robot.m_oi.ojoy.getRawButtonPressed(4) && rollerSpeed <= 1) {
    		rollerSpeed= rollerSpeed+0.05;
    	}
    	if (Robot.m_oi.ojoy.getRawButtonPressed(1) && rollerSpeed >= 0.05) {
    		rollerSpeed = rollerSpeed - 0.05;
    	}
    	if(Robot.m_oi.ojoy.getRawButton(3)) {
    	Robot.intake.manipulate(-rollerSpeed, rollerSpeed);
    	}
    	else if(Robot.m_oi.ojoy.getRawButton(2)) {
    		Robot.intake.manipulate(rollerSpeed, -rollerSpeed);
    	}
    	else {
    		Robot.intake.manipulate(Robot.m_oi.ojoy.getRawAxis(1), -Robot.m_oi.ojoy.getRawAxis(5));
    	}
        
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    
// Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}