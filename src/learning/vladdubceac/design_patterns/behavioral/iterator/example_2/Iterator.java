package learning.vladdubceac.design_patterns.behavioral.iterator.example_2;

public interface Iterator {
    void first();
    String next();
    boolean isDone();
    String currentItem();
}
