public class LaLigaPlayer extends FootballPlayer {

    private int matchesPlayed;

    public LaLigaPlayer(String name, int goals, double salary, int matchesPlayed) {
        super(name, goals, salary);
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public double calculateGoalRate() {
        return (double) goals / matchesPlayed;
    }

    public void displayDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("League: La Liga");
        System.out.println("Goals Scored: " + goals);
        System.out.println("Goal Rate: " + calculateGoalRate());
        System.out.println();
    }
}
