package org.usfirst.frc.team3735.robot.subsystems;

import org.usfirst.frc.team3735.robot.MultiSpeedController;
import org.usfirst.frc.team3735.robot.RobotMap;
import org.usfirst.frc.team3735.robot.commands.*;

//import edu.wpi.first.wpilibj.CANTalon;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SysDrive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static double kNFilterTurn  = 3;
	private static double kNTurnGain    = 0.8;
	
	private static double kNDriveFilter 		= 3;
	
	private static double filteredy;
	private static double filteredtwist;
	
	//CANTalon l1 =
	
	CANTalon left1 = new CANTalon(RobotMap.CAN.leftDrive1);
	CANTalon left2 = new CANTalon(RobotMap.CAN.leftDrive2);
	CANTalon left3 = new CANTalon(RobotMap.CAN.leftDrive3);
	
	CANTalon right1 = new CANTalon(RobotMap.CAN.rightDrive1);
	CANTalon right2 = new CANTalon(RobotMap.CAN.rightDrive2);
	CANTalon right3 = new CANTalon(RobotMap.CAN.rightDrive3);
	
	MultiSpeedController leftDrive = new MultiSpeedController(new SpeedController[] { left1, left2, left3  },
			"Drive", "Left Multi Drive");

	MultiSpeedController rightDrive = new MultiSpeedController(new SpeedController[] { right1, right2, right3 },
			"Drive", "Right Multi Drive");


	RobotDrive drivetrain = new RobotDrive(leftDrive, rightDrive);
	
	public SysDrive(){
		
		//rightDrive.setInverted(true);
		
//		left1.changeControlMode(CANTalon.TalonControlMode.Voltage);
//		left1.setVoltageCompensationRampRate(kVrate);
//		left2.changeControlMode(CANTalon.TalonControlMode.Voltage);
//		left2.setVoltageCompensationRampRate(kVrate);
//		left3.changeControlMode(CANTalon.TalonControlMode.Voltage);
//		left3.setVoltageCompensationRampRate(kVrate);
//		
//		right1.changeControlMode(CANTalon.TalonControlMode.Voltage);
//		right1.setVoltageCompensationRampRate(kVrate);
//		right2.changeControlMode(CANTalon.TalonControlMode.Voltage);
//		right2.setVoltageCompensationRampRate(kVrate);
//		right3.changeControlMode(CANTalon.TalonControlMode.Voltage);
//		right3.setVoltageCompensationRampRate(kVrate);
		filteredy		=0.0;
		filteredtwist	=0.0;

	}
	
	//sends any important information to smartdashboard. Called in Robot.java
	public void log(){
		
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new CmdDriveArcadeUsingJoyStickNoFinished());
    }
    

    public void move(double y, double twist){
    	SmartDashboard.putNumber("y ", y);
    	SmartDashboard.putNumber("twist ", twist);
    	
    	/* This is a Filter Ramp so that there is no Jerks */
    	filteredy 		= (y + filteredy*(kNDriveFilter-1))/kNDriveFilter;
    	filteredtwist 	= (twist + filteredtwist*(kNFilterTurn-1))/kNFilterTurn;
    	/* Here we use the Ramped Output */
    	drivetrain.arcadeDrive(filteredy, -1.0*kNTurnGain*filteredtwist);
    	SmartDashboard.putNumber("filteredy ", filteredy);
    	SmartDashboard.putNumber("filteredtwist ", filteredtwist);
    	
    }
    
 
}

