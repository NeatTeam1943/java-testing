// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  Talon leftTalon = null;
  Talon secLeftTalon = null;
  Talon rightTalon = null;
  Talon secRightTalon = null;

  SpeedControllerGroup leftM = null;
  SpeedControllerGroup rightM = null;
  DifferentialDrive differentialDrive = null;

  public DriveTrain() {
    leftTalon = new Talon(Constants.LEFT_TALON);
    secLeftTalon = new Talon(Constants.SEC_LEFT_TALON);
    rightTalon = new Talon(Constants.RIGHT_TALON);
    secRightTalon = new Talon(Constants.SEC_RIGHT_TALON);


    leftM = new SpeedControllerGroup(leftTalon,secLeftTalon);
    rightM = new SpeedControllerGroup(rightTalon,secRightTalon);
    differentialDrive = new DifferentialDrive(leftM,rightM);
  }
  
  public void ArcadeDrive(double move, double rotate){
    differentialDrive.arcadeDrive(move, rotate);
  }
  




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
