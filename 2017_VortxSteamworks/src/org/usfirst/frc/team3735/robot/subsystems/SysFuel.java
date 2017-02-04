package org.usfirst.frc.team3735.robot.subsystems;

import org.usfirst.frc.team3735.robot.*;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SysFuel extends Subsystem {
	CANTalon intakemotor = new CANTalon(RobotMap.CAN.intakeSpinner);
	CANTalon shootmotor = new CANTalon(RobotMap.CAN.shootSpinner);
	private static double kSpeed    = 0.6;
   
	public SysFuel(){
		intakemotor.setInverted(true);
	} 

    
	public void log() {

	}


  	public void initDefaultCommand() {

  	}
  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void setIntakeSpeed(double speed){
    	intakemotor.set(kSpeed);
    	
    }
 
    public void setShootSpeed(double speed){
    	intakemotor.set(speed);
    	
    }
 
}

