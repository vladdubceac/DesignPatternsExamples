package learning.vladdubceac.design_patterns.structural.adapter.class_inheritance;

public class ObjectAdapter {
private IntegerValueInterface myInt;

    public ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    public int getInteger(){
        return 2 + myInt.getInteger();
    }
}
