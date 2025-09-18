public class Game {
    public String namaGame;
    public String genre;
    public Developer developer;
    public int playerCount = 0;
    public static int totalGame;

    public Game(String namaGame, String genre, Developer developer) {
        this.namaGame = namaGame;
        this.genre = genre;
        this.developer = developer;
        totalGame++;
    }

    public void joinGame(Player p) {
        this.playerCount++;
        System.out.println(p.username + " bergabung ke game " + this.namaGame + ".");
    }

    public static int getTotalGame() {
        return totalGame; 
    }
}