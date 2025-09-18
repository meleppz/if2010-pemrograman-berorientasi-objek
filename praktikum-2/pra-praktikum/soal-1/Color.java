public class Color {
    private int red;
    private int green;
    private int blue;

    /**
     * Konstruktor Color
     * 
     * @param r nilai red (0-255)
     * @param g nilai green (0-255)
     * @param b nilai blue (0-255)
     */
    public Color(int r, int g, int b) {
        System.out.printf("Color is being built with RGB(%d, %d, %d)\n", r, g, b);
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    @Override
    /**
     * toString
     * 
     * fungsi ini berguna untuk mengembalikan representasi string dari objek Color
     * usage: 
     * System.out.println(colorObject);
     * 
     * pada umumnya, ketika sebuah objek dicetak menggunakan System.out.println atau
     * metode lainnya, metode toString() akan dipanggil secara otomatis untuk
     * mendapatkan representasi string dari objek tersebut.
     * 
     * @return string representasi warna dalam format "RGB(red, green, blue)"
     */
    public String toString() {
        if ((0 <= this.red) && (this.red <= 255) && (0 <= this.green) && (this.green <= 255) && (0 <= this.blue) && (this.blue <= 255)){
            String rgbString = "RGB("+ this.red + ", " + this.green + ", " + this.blue + ")";
            return rgbString;
        }
        return null;
    }

    /**
     * getRed
     * 
     * @return nilai red
     */
    public int getRed() {
        return this.red;
    }

    /**
     * getGreen
     * 
     * @return nilai green
     */
    public int getGreen() {
        return this.green;
    }

    /**
     * getBlue
     * 
     * @return nilai blue
     */
    public int getBlue() {
        return this.blue;
    }

    /**
     * setColor
     * Mengubah nilai warna
     * 
     * @param r nilai red (0-255)
     * @param g nilai green (0-255)
     * @param b nilai blue (0-255)
     */
    public void setColor(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }
}