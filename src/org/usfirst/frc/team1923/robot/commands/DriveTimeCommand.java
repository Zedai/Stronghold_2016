package org.usfirst.frc.team1923.robot.commands;

import org.usfirst.frc.team1923.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 * @author Xavier (1/18/16)
 * @modified Saikiran Nakka (1/19/16)
 *
 */

public class DriveTimeCommand extends Command {

	private double speed;
	
	public DriveTimeCommand(double speed, double timeOut){
		requires(Robot.driveSubsystem);
		setTimeout(timeOut);
		this.speed = speed;
	}

	protected void initialize() {
		
	}

	protected void execute() {
		Robot.driveSubsystem.smoothDrive(speed, speed);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.driveSubsystem.stop();
	}

	protected void interrupted() {
		end();
	}
	
}
