/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3735.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team3735.robot.OI;
import org.usfirst.frc.team3735.robot.commands.Autonomous;
import org.usfirst.frc.team3735.robot.subsystems.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    private static final int kSize640x480 = 0;
    private static final int kSize320x240 = 1;
    private static final int kSize160x120 = 2;
    

	Command autonomousCommand;

    public static SysDrive  drive;
    public static SysGear   gear;
    public static SysFuel   fuel;
    public static SysScaler scaler;
    public static SysVision vision;
    
    public static OI oi;
    public static RobotMap robotmap;
    
    double dis = 0.0;
	double spd = 0.0;
	String disString = "0";

    
    CameraServer server;


    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	
        // Initialize all subsystems
    	robotmap 	= new RobotMap();
    	
    	// Sub Systems
    	drive  		= new SysDrive();
	   	gear 		= new SysGear();
	   	fuel 		= new SysFuel();
	   	scaler		= new SysScaler();
	   	vision		= new SysVision();
	   	// Operator IO
	   	oi 			= new OI();
	   	
        // instantiate the command used for the autonomous period
        autonomousCommand = new Autonomous();
        
        // Let Start the Web Cam and Send to Dashboard
    	server = CameraServer.getInstance();
        //server.setQuality(50);
        //server.setSize(kSize320x240);
        server.startAutomaticCapture();
        server.putVideo("name", 100, 100);
        //the camera name (ex "cam0") can be found through the roborio web interface
        //server.startAutomaticCapture("cam3");

   }

    public void autonomousInit() {
        autonomousCommand.start(); // schedule the autonomous command (example)
    }
    

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        log();
    }

    public void teleopInit() {
    	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        log();
    }
    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
        
    	
    }

	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
    private void log() {
    	
    
    	
    }
    
  
}
