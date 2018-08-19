public class Robot {

    Arm arm;
    Leg leg;

    public Robot(Arm arm, Leg leg) {
        this.arm = arm;
        this.leg = leg;
    }

    public Arm getArm() {
        return arm;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
