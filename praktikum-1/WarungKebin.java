import java.util.Scanner;

public class WarungKebin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int i = 0;
        while (i < N) {
            scanner.nextLine();
            String nama = scanner.nextLine();
            int nomorMeja = scanner.nextInt();
            float saldo = scanner.nextFloat();
            scanner.nextLine();
            String namaMakanan = scanner.nextLine();
            int jumlah = scanner.nextInt();
            float hargaSatuan = scanner.nextFloat();

            Pembeli pembeli = new Pembeli(nama, nomorMeja, saldo);
            OrderMakanan orderMakanan = new OrderMakanan(namaMakanan, jumlah, hargaSatuan);

            System.out.println("=== Pembeli " + (i + 1) + " ===");
            System.out.println("Nama: " + pembeli.getNamaPembeli() + " (Meja " + pembeli.getNomorMeja() + ")");
            System.out.println("Pesanan: " + orderMakanan.getNamaMakanan() + " x " + orderMakanan.getcountMakanan() + " @ " + orderMakanan.getHargaSatuan());
            System.out.println("Total: " + orderMakanan.getTotalHarga());
            
            if(pembeli.cekBisaBayar(orderMakanan)){
                Double saldoBaru = saldo - orderMakanan.getTotalHarga();
                pembeli.setSaldo(saldoBaru);
                System.out.println("Bisa Bayar: Bisa");
                System.out.println("Saldo setelah bayar: " + pembeli.getSaldo());
            }
            else{
                System.out.println("Bisa Bayar: Gak Bisa");
            }

            System.out.printf("\n");
            i++;
        }

        scanner.close();
    }
}