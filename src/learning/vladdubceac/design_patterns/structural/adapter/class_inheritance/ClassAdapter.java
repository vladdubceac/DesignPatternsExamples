package learning.vladdubceac.design_patterns.structural.adapter.class_inheritance;

public class ClassAdapter extends IntegerValue {

    public int getInteger(){
        return 2 + super.getInteger();
    }
}
