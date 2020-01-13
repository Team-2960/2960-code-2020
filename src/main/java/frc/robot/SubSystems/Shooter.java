package frc.robot.SubSystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.SensorCollection;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.sensors.CANCoder;
public class Shooter extends SubsystemBase{
    private static Shooter shooter;
    private TalonFX mLeftShooter;
    private TalonFX mRightShooter;
    private CANCoder LeftEncoder;
    private CANCoder RightEncoder;
    public void setShooterSpeed(double speed){
      mLeftShooter.set(ControlMode.PercentOutput, speed);
      mRightShooter.set(ControlMode.PercentOutput, speed);
    }
    public void shooterEncoder(){
      System.out.println(LeftEncoder.getVelocity());
      System.out.println(RightEncoder.getVelocity());
    }
    public static Shooter get_Instance(){
      if(shooter == null){
        shooter = new Shooter();
      } 
      return shooter;
    }
    
    private Shooter(){
      mLeftShooter = new TalonFX(Constants.mLeftShooter);
      mRightShooter = new TalonFX(Constants.mLeftShooter);
      LeftEncoder = new CANCoder(Constants.mRightShooter);
      RightEncoder = new CANCoder(Constants.mRightShooter);
    }
    @Override
  public void periodic() {


    // This method will be called once per scheduler run
  }
}