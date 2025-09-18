public class Player {
    public String username;
    public Avatar avatar;
    public Game game;
    public static int totalPlayer;

    public Player(String username, Avatar avatar) {
        this.username = username;
        this.avatar = avatar;
        totalPlayer++;
    }

    public void joinGame(Game g) {
        this.game = g;
        g.joinGame(this);
    }

    public void showProfile() {
        System.out.println("Username: " + this.username +".");
        System.out.println("Avatar: " + this.avatar.namaSkin + " (Lv." + this.avatar.level + ").");
        if (this.game != null){
            System.out.println("Sedang bermain: " + this.game.namaGame + ".");
        }
        else{
            System.out.println("Belum bergabung ke game.");
        }
        System.out.println("");
    }

    public static int getTotalPlayer() {
        return totalPlayer; 
    }
}