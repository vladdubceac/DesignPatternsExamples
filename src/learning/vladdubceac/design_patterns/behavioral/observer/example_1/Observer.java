package learning.vladdubceac.design_patterns.behavioral.observer.example_1;

public interface Observer {
    // method to update the observer, used by subject
    public void update();

    // attach with subject to observer, not required, but added so that the
    // observer can query the subject to see if an update has occured
    public void setSubject(Subject sub);
}
