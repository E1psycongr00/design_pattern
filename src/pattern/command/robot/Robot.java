package pattern.command.robot;

public class Robot {
    public enum Direction {LEFT, RIGHT} // 방향 표시


    public void moveForward(int space) {
        System.out.println(space + " 칸 전진");
    }

    public void turn(Direction direction) {
        String s = (direction == Direction.LEFT ? "왼쪽" : "오른쪽") +
                "으로 전환한다.";
        System.out.println(s);
    }

    public void pickup() {
        System.out.println("앞의 물건 집어들기");
    }
}
