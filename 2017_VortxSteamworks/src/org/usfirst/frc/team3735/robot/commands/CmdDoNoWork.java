package org.usfirst.frc.team3735.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class CmdDoNoWork extends InstantCommand {
	double x;
    public CmdDoNoWork() {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called once when the command executes
    protected void initialize() {
    	x = x *1.0; // Just Kill Time
    }

}
