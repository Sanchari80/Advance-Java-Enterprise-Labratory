public class PremierLeaguePlayer extends FootballPlayer {
    private int matchesPlayed;

    public PremierLeaguePlayer(String name, int goals, double salary, int matchesPlayed) {
        super(name, goals, salary);
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public double calculateGoalRate() {
        return (double) goals / matchesPlayed;
    }

    public void displayDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("League: Premier League");
        System.out.println("Goals Scored: " + goals);
        System.out.println("Goal Rate: " + calculateGoalRate());
        System.out.println();
    }
}
