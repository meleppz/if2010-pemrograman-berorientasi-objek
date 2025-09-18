public class Avatar {
    public String namaSkin;
    public int level;

    public Avatar(String namaSkin, int level) {
        this.namaSkin = namaSkin;
        this.level = level;
    }

    public void upgradeLevel() {
        this.level++;
        System.out.println("Skin " + this.namaSkin + " naik ke level " + this.level + ".");
    }
} 
    

