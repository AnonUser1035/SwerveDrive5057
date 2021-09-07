// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.subsystems.SwerveDrive;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  /** The container for the robot. Contains subsystems, OI devices, and commands. */

  public  static XboxController xbox_controller = new XboxController(Constants.xbox_port);

  POVButton leftPad = new POVButton(xbox_controller, Constants.left_pad_num);
  POVButton rightPad = new POVButton(xbox_controller, Constants.right_pad_num);
  POVButton upPad = new POVButton(xbox_controller, Constants.up_pad_num);
  POVButton downPad = new POVButton(xbox_controller, Constants.down_pad_num);

  JoystickButton xButtonSwitchDrive = new JoystickButton(xbox_controller, Constants.x_button_num);

  JoystickButton rightButtonIncMotor = new JoystickButton(xbox_controller, Constants.rb_button_num);
  JoystickButton leftButtonDecMotor = new JoystickButton(xbox_controller, Constants.lb_button_num);

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

  // Converts the naxX output to 0-360
  public static double navxTo360(double angle){
        
    if (angle<=0) angle += 360;

    return 360-angle;
  }

  private void configureButtonBindings() {
    /*   leftPad.whenPressed(SwerveDrive.moveSwerve(90, 0));
    rightPad.whenPressed(new SwerveDrive.moveSwerve(270, 0));
    upPad.whenPressed(new SwerveDrive.moveSwerve(0, 0));
    downPad.whenPressed(new SwerveDrive.moveSwerve(180, 0));*/

    //xButtonSwitchDrive.whenPressed(new SwitchDriveMode(driveTrain, navx));
    //rightButtonIncMotor.whenPressed(new ChangeMaxSpeed(0.1));
    //leftButtonDecMotor.whenPressed(new ChangeMaxSpeed(-0.1));
  }
}
