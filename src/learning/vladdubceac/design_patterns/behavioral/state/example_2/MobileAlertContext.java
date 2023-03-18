package learning.vladdubceac.design_patterns.behavioral.state.example_2;

public class MobileAlertContext {
    private MobileAlertState state;

    public MobileAlertContext(MobileAlertState state) {
        this.state = state;
    }

    public void alert(){
        state.alert();
    }

    public void setState(MobileAlertState state) {
        this.state = state;
    }
}
