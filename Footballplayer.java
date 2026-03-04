abstract class FootballPlayer {
    protected String name;
    protected int goals;
    private double monthlySalary; 

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

class LaLigaPlayer extends FootballPlayer {
    public LaLigaPlayer(String name, int goals, double salary) {
        super(name, goals, salary);
    }

    @Override
    public double calculateGoalRate(int matchesPlayed) {
        return (double) goals / matchesPlayed;
    }
}

class PremierLeaguePlayer extends FootballPlayer {
    public PremierLeaguePlayer(String name, int goals, double salary) {
        super(name, goals, salary);
    }

    @Override
    public double calculateGoalRate(int matchesPlayed) {
        return (double) goals / matchesPlayed;
    }
}

public class Main {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Messi", 30, 1000000);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 25, 900000);

        
        messi.displayBasicInfo();
        System.out.println("League: LaLiga");
        System.out.println("Goal Rate: " + messi.calculateGoalRate(35) + "\n");

        
        ronaldo.displayBasicInfo();
        System.out.println("League: Premier League");
        System.out.println("Goal Rate: " + ronaldo.calculateGoalRate(32));
    }
}
