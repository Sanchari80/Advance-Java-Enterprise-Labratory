// Abstract Class
public abstract class FootballPlayer {
    protected String name;
    protected int goals;
    private double monthlySalary; // Confidential

    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    // Abstract method
    public abstract double calculateGoalRate();

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
