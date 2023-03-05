package learning.vladdubceac.design_patterns.structural.decorator.example_1.abstraction;

public abstract class AbstractDecorator extends Component {
    protected Component component;

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
