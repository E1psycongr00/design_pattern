package pattern.behavioral.command;

import java.util.ArrayList;

public class RobotKit {
    private Robot robot = new Robot();
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void start() {
        for(Command command : commands) {
            // setRobot 덕분에 다른 로봇도 동일한 Command로 조종이 가능하다.
            // command의 재활용성이 높아진다.
            command.setRobot(robot);
            command.execute();
        }
    }
}
