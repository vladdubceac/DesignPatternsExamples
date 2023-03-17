package learning.vladdubceac.design_patterns.behavioral.observer.example_2;

public class CurrentScore implements Observer {
    private int runs;
    private int wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.println("\nCurrent Score Display\n"
                + "Runs: " + runs +
                "\nWickets: " + wickets +
                "\nOvers: " + overs);
    }
}
