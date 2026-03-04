public abstract class FootballPlayer {
    protected String name;
    protected int goals;
    private double monthlySalary; // Confidential

    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    public abstract double calculateGoalRate(int matchesPlayed);

    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Goals Scored: " + goals);
    }
}
