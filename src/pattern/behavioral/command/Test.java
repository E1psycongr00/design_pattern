package pattern.behavioral.command;

public class Test {
    public static void main(String[] args) {
        RobotKit robotKit = new RobotKit();
        robotKit.addCommand(new MoveForwardCommand(3));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new PickupCommand());
        robotKit.start();
    }
}
