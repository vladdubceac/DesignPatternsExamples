package learning.vladdubceac.design_patterns.creational.singleton.lazy_initialization;

public class Singleton {

    // the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData(){
        return data;
    }
}
