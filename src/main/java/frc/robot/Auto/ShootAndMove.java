package frc.robot.Auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Auto.Commands.*;

public class ShootAndMove extends SequentialCommandGroup{
    public ShootAndMove(){
        addCommands(
            new pGotoAngle(150),
            new Shoot(-6000),
            new DriveWithTime(0.25,0.25, 0.5)
        );

    }
}