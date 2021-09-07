package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.Constants;

public class SwerveDrive {
    public SwerveDrive() {}
    TalonSRX leftMotor = new TalonSRX(Constants.left_motor_port);
    TalonSRX rightMotor = new TalonSRX(Constants.right_motor_port);
    public static void moveSwerve(double angle, double magnitude) {
    }
}