package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Sendable;
import frc.robot.Camera.Camera;
import frc.robot.OI;
import frc.robot.Constants;
import frc.robot.SubSystems.*;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
  private OI oi;
  private LEDs leds;
  private Camera camera = Camera.get_Instance();
  private Compressor compressor = new Compressor();
  @Override
  public void robotInit() {
    oi = new OI();
    leds = new LEDs();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void robotPeriodic() {
    // TODO Auto-generated method stub
    super.robotPeriodic();
    CommandScheduler.getInstance().run();
    camera.update();
    compressor.start();
    
  }

  @Override
  public void disabledInit() {
    // TODO Auto-generated method stub
    super.disabledInit();
    //oi.pivot.DisablePivotPID();
  }

  @Override
  public void teleopPeriodic() {
    //no code have to be here
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
