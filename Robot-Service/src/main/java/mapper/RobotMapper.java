package mapper;

import domain.Robot;
import dto.RobotDTO;

public interface RobotMapper {

    RobotDTO map(Robot robot);
}
