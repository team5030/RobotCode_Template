package frc.robot.commands.drivecomands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class TankDrive extends CommandBase {
    private DriveTrain m_driveTrain;
    private XboxController m_driver;
    public TankDrive(DriveTrain driveTrain,XboxController driver) {
      m_driveTrain = driveTrain;
      m_driver = driver;
      addRequirements(m_driveTrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      double leftSpeed = -m_driver.getY(Hand.kLeft);
      double rightSpeed = -m_driver.getY(Hand.kRight);
      m_driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  } 