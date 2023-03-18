package learning.vladdubceac.design_patterns.behavioral.state.example_2;

public class Client {

    public static void main(String[] args) {
        MobileAlertContext context = new MobileAlertContext(new VibrationState());
        context.alert();
        context.alert();

        context.setState(new SilentState());
        context.alert();
        context.alert();
        context.alert();
    }
}
