package Pertemuan2;

class Produk{
    String ID, nama;
    int stok;
    double harga;

    void cekDataProduk(){
        System.out.println("DATA PRODUK");
        System.out.println("Nama        : " + nama);
        System.out.println("ID Produk   : " + ID);
        System.out.println("Stok        : " + stok);
        System.out.printf("Harga       : Rp. %.2f"+harga);
    }

    void cekProduk(){
        if (stok == 0){
            System.out.println("Tidak Tersedia");
        } else {
            System.out.println("Stok tersedia : "+ stok);
        }
    }
}