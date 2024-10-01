/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Output Produk");
        Elektronik produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo();
        
        System.out.println("\n2. Output Pegawai");
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Maulana", 5000000, 1000000);
        pegawaiTetap.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme");
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        produk2.tampilkanInfo();
        
        Pegawai pegawai2 = new PegawaiKontrak("Ilham", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}
