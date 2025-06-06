// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drive;

public class TeleopDrive extends Command {
  private final Drive drive;
  private final CommandXboxController controller;
  /** Creates a new TeleopDrive. */
  public TeleopDrive(Drive drive, CommandXboxController controller) {
    // Use addRequirements() here to declare subsystem dependencies.
  
  this.drive = drive;
  this.controller = controller;
  addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.drive.arcadeDrive(-controller.getLeftY(), -controller.getRightX());
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
