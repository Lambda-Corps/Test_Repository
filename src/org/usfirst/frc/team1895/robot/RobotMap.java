package org.usfirst.frc.team1895.robot;

public interface RobotMap {
	
	//Robot Constraints
		double mass = 0.0; // kg
		double max_acc = 0.0; // m/s^2
		double max_vel = 0.0; // m/s
	
	//Driver's Station
		
	//Drivetrain PID constants
		double p = 0.0;
		double i = 0.0;
		double d = 0.0;
	
	//CAN Motor Ports
		int fl_motor_port = 0;
		int fr_motor_port = 1;
		int rl_motor_port = 2;
		int rr_motor_port = 3;
	
}
