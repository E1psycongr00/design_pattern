package pattern.behavioral.command;

/*
        커맨드 패턴은 로봇 객체에 의존한다.
        robot 객체를 인스턴스로 사용해서 robot의 기능을 조종한다.
 */
public abstract class Command {
    protected Robot robot;

    //setter
    public void setRobot(Robot robot) {
        this.robot = robot;
    }
    public abstract void execute();
}

class MoveForwardCommand extends Command {
    int space;
    public MoveForwardCommand(int space) {
        this.space = space;
    }

    @Override
    public void execute() {
        robot.moveForward(this.space);
    }
}

class TurnCommand extends Command {
    Robot.Direction direction;
    public TurnCommand(Robot.Direction direction) {
        this.direction = direction;
    }
    @Override
    public void execute() {
        robot.turn(direction);
    }
}

class PickupCommand extends Command {
    @Override
    public void execute() {
        robot.pickup();
    }
}