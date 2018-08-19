import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RobotTest {

    @Test
    public void testRobotWithArmColor() {
        Arm arm = new Arm();
        arm.setColor("Brown");
        arm.setLength(100L);
        arm.setStrength(250);
        Leg leg = new Leg();
        Robot robot = new Robot(arm, leg);
        assertEquals(robot.getArm().getColor(), "Brown");
    }

    @Test
    public void testRobotWithArmLength() {
        Arm arm = new Arm();
        arm.setColor("Brown");
        arm.setLength(100L);
        arm.setStrength(250);
        Leg leg = new Leg();
        Robot robot = new Robot(arm, leg);
        assertEquals(robot.getArm().getLength().longValue(), 100);
    }

    @Test
    public void testRobotWithArmStrength() {
        Arm arm = new Arm();
        arm.setColor("Brown");
        arm.setLength(100L);
        arm.setStrength(250);
        Leg leg = new Leg();
        Robot robot = new Robot(arm, leg);
        assertEquals(robot.getArm().getStrength().longValue(), 250);
    }
}
