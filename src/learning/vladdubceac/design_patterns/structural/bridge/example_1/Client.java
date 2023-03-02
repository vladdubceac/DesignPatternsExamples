package learning.vladdubceac.design_patterns.structural.bridge.example_1;

import learning.vladdubceac.design_patterns.structural.bridge.example_1.abstraction.Bike;
import learning.vladdubceac.design_patterns.structural.bridge.example_1.abstraction.Car;
import learning.vladdubceac.design_patterns.structural.bridge.example_1.abstraction.Vehicle;
import learning.vladdubceac.design_patterns.structural.bridge.example_1.implementation.Assembler;
import learning.vladdubceac.design_patterns.structural.bridge.example_1.implementation.Producer;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Producer(), new Assembler());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Producer(), new Assembler());
        vehicle2.manufacture();
    }
}
