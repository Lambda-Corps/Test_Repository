package org.usfirst.frc.team1895.robot.subsystems;


import java.util.List;

import org.usfirst.frc.team1895.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class DriveTrain extends PIDSubsystem {
    
	private CANTalon fl_motor = new CANTalon(RobotMap.fl_motor_port);
	private CANTalon fr_motor = new CANTalon(RobotMap.fr_motor_port);
	private CANTalon rl_motor = new CANTalon(RobotMap.rl_motor_port);
	private CANTalon rr_motor = new CANTalon(RobotMap.rr_motor_port);
	
	private MotorGroup<CANTalon>  leftMotor = new MotorGroup<CANTalon>(fl_motor, rl_motor);
	private MotorGroup<CANTalon> rightMotor = new MotorGroup<CANTalon>(fr_motor, rr_motor);
	
	public DriveTrain() {
		super(RobotMap.p, RobotMap.i, RobotMap.d);
	}
	
	public void set(double v) {
		leftMotor.set(v);
		rightMotor.set(v);
	}
	
	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	protected void usePIDOutput(double arg0) {
		// TODO Auto-generated method stub
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
	private class MotorGroup<T extends SpeedController> {
		
		private List<T> list;
		
		private MotorGroup(T...t) {
			for(T i : t) { list.add(i);}
		}
		
		private void set(double v) {
			for(T i : list) { i.set(v);}
		}
	}
}