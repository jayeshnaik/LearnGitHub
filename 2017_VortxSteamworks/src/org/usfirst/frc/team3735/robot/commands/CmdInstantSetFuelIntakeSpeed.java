package org.usfirst.frc.team3735.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;

import org.usfirst.frc.team3735.robot.Robot;

/**
 *
 */
public class CmdInstantSetFuelIntakeSpeed extends InstantCommand {
	double speed=0;
	
    public CmdInstantSetFuelIntakeSpeed(double s) {
    	speed = s;
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.fuel.setIntakeSpeed(speed);
    }

}
