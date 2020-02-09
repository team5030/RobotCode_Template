/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//CTRE WPI_TalonSRX Class Import
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

//WpiLib Imports
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Constants Class Imports
import frc.robot.Constants.CAN;
import frc.robot.Constants.Misc;

public class DriveTrain extends SubsystemBase {
  //Motor Declarations: WPI_TalonSRX is used insted of TalonSRX Because TalonSRX is incompadible with WPILib
  private WPI_TalonSRX leftDriveMotor_1 = new WPI_TalonSRX(CAN.kLeftDriveMotor_1);
  private WPI_TalonSRX rightDriveMotor_1 = new WPI_TalonSRX(CAN.kRighDriveMotor_1);
  private WPI_TalonSRX leftDriveMotor_2 = new WPI_TalonSRX(CAN.kLeftDriveMotor_2);
  private WPI_TalonSRX rightDriveMotor_2 = new WPI_TalonSRX(CAN.kRighDriveMotor_2);

  //SpeedControllerGroup Declarations
  private SpeedControllerGroup leftMotor = new SpeedControllerGroup(leftDriveMotor_1, leftDriveMotor_2);
  private SpeedControllerGroup rightMotor = new SpeedControllerGroup(rightDriveMotor_1, rightDriveMotor_2);

  //DifferentialDrive Declaration
  private DifferentialDrive m_drive = new DifferentialDrive(leftMotor, rightMotor);

  //Constructs new DriveTrain
  public DriveTrain() {
    //DifferentialDrive preamiters
    m_drive.setMaxOutput(Misc.kMaxDriveSpeed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
   /**
   * Arcade drive method for differential drive platform.
   * The calculated values will be squared to decrease sensitivity at low speeds.
   *
   * @param xSpeed    The robot's speed along the X axis [-1.0..1.0]. Forward is positive.
   * @param zRotation The robot's rotation rate around the Z axis [-1.0..1.0]. Clockwise is
   *                  positive.
   */
  public void arcadeDrive(double xSpeed, double zRotation){
    m_drive.arcadeDrive(xSpeed, zRotation);
  }
  /**
   * Tank drive method for differential drive platform.
   * The calculated values will be squared to decrease sensitivity at low speeds.
   *
   * @param leftSpeed  The robot's left side speed along the X axis [-1.0..1.0]. Forward is
   *                   positive.
   * @param rightSpeed The robot's right side speed along the X axis [-1.0..1.0]. Forward is
   *                   positive.
   */
  public void tankDrive(double leftSpeed,double rightSpeed){
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }
  public void stop() {
    m_drive.stopMotor();
  }
}
