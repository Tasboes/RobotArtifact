package domain;

public class Robot {

    private int id;
    private Arm arm;
    private Leg leg;

    public Robot(Arm arm, Leg leg) {
        this.arm = arm;
        this.leg = leg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
