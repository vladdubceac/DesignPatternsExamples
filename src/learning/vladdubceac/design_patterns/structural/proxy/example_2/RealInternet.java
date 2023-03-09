package learning.vladdubceac.design_patterns.structural.proxy.example_2;

public class RealInternet implements Internet {

    public RealInternet(){
    }

    @Override
    public void connect(String host) throws Exception {
        System.out.println("Connecting to "+host);
    }
}
