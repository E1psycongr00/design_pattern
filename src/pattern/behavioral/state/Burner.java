package pattern.behavioral.state;

public class Burner {
    ModeState modeState = new ModeStateOFF();

    // modeState setter
    public void setModeState(ModeState modeState) {
        this.modeState = modeState;
    }

    public void toggle() {
        modeState.toggle(this);
    }

}
