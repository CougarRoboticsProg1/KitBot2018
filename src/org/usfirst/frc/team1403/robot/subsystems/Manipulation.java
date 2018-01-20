package org.usfirst.frc.team1403.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulation extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public DoubleSolenoid solenoid1, solenoid2;
	public Servo servo1, servo2;
	
	public Manipulation() {
		solenoid1 = new DoubleSolenoid(1,2);
		solenoid2 = new DoubleSolenoid(3,4);
		servo1 = new Servo(1);
		servo2 = new Servo(2);
	}
	
	public void platform(double p, double f) {
		servo1.set(p);
		servo2.set(f);
	}
	
	public void set1() {
	
		solenoid1.set(DoubleSolenoid.Value.kForward);
	
	}
	public void set2() {
	
		solenoid1.set(DoubleSolenoid.Value.kReverse);
	
	}
	public void set3() {
		solenoid2.set(DoubleSolenoid.Value.kForward);
	}
	public void set4() {
		solenoid2.set(DoubleSolenoid.Value.kReverse);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new Manipulate());
    }
}

