package service;

import domain.Arm;
import domain.Leg;
import domain.Robot;
import dto.RobotDTO;

public class RobotServiceImpl implements RobotService {

    @Override
    public RobotDTO getRobotProperties(Integer robotId) {

        Arm arm = new Arm();
        Leg leg = new Leg();
        Robot robot = new Robot(arm, leg);
        robot.setId(robotId);

        return new RobotDTO();
    }
}
