package learning.vladdubceac.design_patterns.behavioral.state.example_2;

public class VibrationState implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("vibration...");
    }
}
