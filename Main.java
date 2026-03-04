public class Main {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Messi", 30, 1000000, 35);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 25, 900000, 32);

        messi.displayDetails();
        ronaldo.displayDetails();
    }
}
