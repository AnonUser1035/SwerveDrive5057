package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.Constants;

public class SwerveDrive {
    TalonSRX leftMotor = new TalonSRX(Constants.left_motor_port);
    TalonSRX rightMotor = new TalonSRX(Constants.right_motor_port);
    public void moveSwerve(double angle, double magnitude) {
    }
}