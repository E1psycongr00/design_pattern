package pattern.behavioral.state;

public interface ModeState {
    public void toggle(Burner burner);
}


class ModeStateOn implements ModeState {
    @Override
    public void toggle(Burner burner) {
        System.out.println("불을 끄겠습니다.");
        // ........
        // 기능 구현
        // ........
        burner.setModeState(new ModeStateOFF());
    }
}

class ModeStateOFF implements ModeState {
    @Override
    public void toggle(Burner burner) {
        System.out.println("불을 올리겠습니다.");
        // ........
        // 기능 구현
        // ........
        burner.setModeState(new ModeStateOn());
    }
}