
package org.usfirst.frc.team3735.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3735.robot.RobotMap;
import org.usfirst.frc.team3735.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private final Joystick driverController;
	private final Joystick coDriverController;
		
	public OI() {
		driverController 		= new Joystick(RobotMap.DRIVER.DriverPort);
		coDriverController 		= new Joystick(RobotMap.CODRIVER.CoDriverPort);
		
		//Scanner sc = new Scanner(System.in);
		
		/* DRIVER CONTROLS */
		
		JoystickButton dc_x 	= new JoystickButton(driverController, 1);
		JoystickButton dc_a 	= new JoystickButton(driverController, 2);
		JoystickButton dc_b 	= new JoystickButton(driverController, 3);
		JoystickButton dc_y 	= new JoystickButton(driverController, 4);
		JoystickButton dc_lb 	= new JoystickButton(driverController, 5);
		JoystickButton dc_rb 	= new JoystickButton(driverController, 6);
		JoystickButton dc_lt 	= new JoystickButton(driverController, 7);
		JoystickButton dc_rt 	= new JoystickButton(driverController, 8);
		JoystickButton dc_back 	= new JoystickButton(driverController, 9);
		JoystickButton dc_start	= new JoystickButton(driverController, 10);
		JoystickButton dc_ljs	= new JoystickButton(driverController, 11);
		JoystickButton dc_rjs	= new JoystickButton(driverController, 12);
		
		/* CO DRIVER CONTROLS */
		
		JoystickButton cdc_x 	= new JoystickButton(coDriverController, 1);
		JoystickButton cdc_a 	= new JoystickButton(coDriverController, 2);
		JoystickButton cdc_b 	= new JoystickButton(coDriverController, 3);
		JoystickButton cdc_y 	= new JoystickButton(coDriverController, 4);
		JoystickButton cdc_lb 	= new JoystickButton(coDriverController, 5);
		JoystickButton cdc_rb 	= new JoystickButton(coDriverController, 6);
		JoystickButton cdc_lt 	= new JoystickButton(coDriverController, 7);
		JoystickButton cdc_rt 	= new JoystickButton(coDriverController, 8);
		JoystickButton cdc_back = new JoystickButton(coDriverController, 9);
		JoystickButton cdc_start= new JoystickButton(coDriverController, 10);
		JoystickButton cdc_ljs	= new JoystickButton(coDriverController, 11);
		JoystickButton cdc_rjs	= new JoystickButton(coDriverController, 12);
		
		
	       
		
		//Example Replace Do Nothing to Real Commands
		dc_x.whenPressed(new CmdDoNoWork());
		dc_a.whenPressed(new CmdDoNoWork());
		dc_b.whenPressed(new CmdDoNoWork());
		dc_y.whenPressed(new CmdDoNoWork());
		dc_lb.whenPressed(new CmdDoNoWork());
		dc_rb.whenPressed(new CmdDoNoWork());
		dc_lt.whenPressed(new CmdDoNoWork());
		dc_rt.whenPressed(new CmdDoNoWork());
		

		
	
		
		
	}
  
	public double getDriverYAxis() {
		return driverController.getY();
	}

	public double getDriverTwistAxis() {
		return driverController.getZ();
	}

	public double getDriverPOV() {
		return driverController.getPOV();
		
	}
	
	
}

