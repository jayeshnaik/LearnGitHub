package org.usfirst.frc.team3735.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import com.ctre.CANTalon;
import org.usfirst.frc.team3735.robot.RobotMap;
import org.usfirst.frc.team3735.robot.RobotConfig;


/**
 *
 */
public class SysGear extends Subsystem {

	CANTalon backintakemotor;
	CANTalon frontintakemotor;
	Solenoid sHumanIntake;
	Solenoid sGearPos;
	DigitalInput gear_switch;
	public SysGear() {
		backintakemotor = new CANTalon(RobotMap.CAN.backGearSpinner); 
		frontintakemotor = new CANTalon(RobotMap.CAN.frontGearSpinner);
		sHumanIntake = new Solenoid(RobotMap.SOLENOID.sGearHumanIntake);
		sGearPos = new Solenoid(RobotMap.SOLENOID.sLiftGear);
		gear_switch = new DigitalInput(RobotMap.SWITCHES.gear_lim);
	}
	
	public void initDefaultCommand() {
        //Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double s) {
    	backintakemotor.set(s);
    	frontintakemotor.set(s);
    }

    public void setBackSpeed(double s) {
    	backintakemotor.set(s);
    }
    
    public void setFrontSpeed(double s) {
    	frontintakemotor.set(s);
    }
    
    
    public void setBrake(boolean b) {
    	backintakemotor.enableBrakeMode(b);
    	frontintakemotor.enableBrakeMode(b);
    }
    
    public void setIntake(boolean b) {
    	sHumanIntake.set(b);
    }
    
    public void setPosition(boolean b) {
    	sGearPos.set(b);
    }
    
    public boolean getGearSwitch() {
    	return gear_switch.get();
    }
    
}

