package learning.vladdubceac.design_patterns.behavioral.observer.example_2;

public class AverageScore implements Observer{
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float)runs/overs;
        this.predictedScore = (int)(this.runRate * 50);
        display();
    }

    public void display(){
        System.out.println("\nAverage Score Display: \n"
        +"Run Rate: "+runRate+
                "\nPredicted Score: "+
                predictedScore);
    }
}
