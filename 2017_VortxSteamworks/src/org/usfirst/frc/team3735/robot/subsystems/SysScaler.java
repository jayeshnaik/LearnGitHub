package org.usfirst.frc.team3735.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import com.ctre.CANTalon;
import org.usfirst.frc.team3735.robot.RobotMap;
import org.usfirst.frc.team3735.robot.RobotConfig;


/**
 *
 */
public class SysScaler extends Subsystem {

	CANTalon scalermotor;
	
	public SysScaler() {
		scalermotor = new CANTalon(RobotMap.CAN.scalermotor); 
	}
	
	public void initDefaultCommand() {
        //Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double s) {
    	scalermotor.set(s);
    }
    
    public void setBrake(boolean b) {
    	scalermotor.enableBrakeMode(b);
    }
    
}

