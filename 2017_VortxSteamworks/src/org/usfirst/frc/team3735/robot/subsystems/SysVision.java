package org.usfirst.frc.team3735.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class SysVision extends Subsystem{

	static final boolean DEBUGPRINT = false;
    NetworkTable         griptable;
	
    public SysVision() {
		griptable = NetworkTable.getTable("GRIP/myContoursReport");
	}
    
	protected void initDefaultCommand() {
		//None
	}
	
	

}
