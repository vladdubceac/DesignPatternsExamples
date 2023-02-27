package learning.vladdubceac.design_patterns.structural.adapter.class_inheritance;

public class Client {

    public static void main(String[] args) {
	// write your code here
        System.out.println("*** Class and Object Adapter Demo ***");
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is returning : "+ca1.getInteger());

        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning : "+oa.getInteger());
    }
}
