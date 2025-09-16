public class OrderMakanan {
    private String namaMakanan;
    private int countMakanan;
    private double hargaSatuan;

    /**
     * Konstruktor OrderMakanan
     * @param nama
     * @param count
     * @param harga
     */
    public OrderMakanan(String nama, int count, double harga) {
        this.namaMakanan = nama;
        this.countMakanan = count;
        this.hargaSatuan = harga;
    }

    /**
     * getNamaMakanan
     * @return namaMakanan
     */
    public String getNamaMakanan() {
        return this.namaMakanan;
    }

    /**
     * setNamaMakanan
     * @param namaBaru
     */
    public void setNamaMakanan(String namaBaru) {
        this.namaMakanan = namaBaru;
    }

    /**
     * getcountMakanan
     * @return countMakanan
     */
    public int getcountMakanan() {
        return this.countMakanan;
    }

    /**
     * setcountMakanan
     * @param countBaru
     */
    public void setcountMakanan(int countBaru) {
        this.countMakanan = countBaru;
    }

    /**
     * getHargaSatuan
     * @return hargaSatuan
     */
    public double getHargaSatuan() {
        return this.hargaSatuan;
    }

    /**
     * setHargaSatuan
     * @param hargaBaru
     */
    public void setHargaSatuan(double hargaBaru) {
        this.hargaSatuan = hargaBaru;
    }

    /**
     * increasecountMakanan
     * Menambahkan countMakanan pesanan
     * @param tambahan
     */
    public void increasecountMakanan(int tambahan) {
        if(tambahan > 0){
            this.countMakanan = this.countMakanan + tambahan;
        }
    }

    /**
     * decreasecountMakanan
     * Mengurangi countMakanan pesanan
     * @param pengurangan
     */
    public void decreasecountMakanan(int pengurangan) {
        if(pengurangan > 0){
            this.countMakanan = this.countMakanan - pengurangan;
        }
    }

    /**
     * getTotalHarga
     * Menghitung total harga pesanan
     * @return totalHarga
     */
    public double getTotalHarga() {
        return this.countMakanan * this.hargaSatuan;
    }
}