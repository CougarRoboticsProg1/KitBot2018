package org.usfirst.frc.team1403.robot.subsystems;

import org.usfirst.frc.team1403.robot.Robot;
import org.usfirst.frc.team1403.robot.RobotMap;
import org.usfirst.frc.team1403.robot.commands.Drive;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *	/*
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands. 
	public Victor topRight, bottomRight, bottomLeft, topLeft;
	
	public DriveTrain() {
		topRight = new Victor(RobotMap.frontRightMotor);
		bottomRight= new Victor(RobotMap.backRightMotor);
		bottomLeft= new Victor(RobotMap.backLeftMotor);
		topLeft = new Victor(RobotMap.frontLeftMotor);
		}
	public void drive(double left, double right){
		if(Robot.m_oi.djoy.getRawButton(6)) {
			topRight.set(right*0.5);
			bottomRight.set(right*0.5);
			bottomLeft.set(-left*0.5);
			topLeft.set(-left*0.5);
		}
		else {
		topRight.set(right);
		bottomRight.set(right);
		bottomLeft.set(-left);
		topLeft.set(-left);	
	}
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    }
}