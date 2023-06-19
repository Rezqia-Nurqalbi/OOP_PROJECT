package com.layout;

import java.util.Scanner;

import com.controllers.DbController;
import com.models.produk;

public class Edit {
    public static void showEditData(String nama) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(40));
        System.out.println("Silahkan Pilih Data yang Ingin Diedit");
        System.out.println("=".repeat(40));
        DbController.getDatabase();
        System.out.println("=".repeat(40));
        System.out.print("Pilih Nama Produk: ");
        nama = sc.nextLine();

        System.out.println("=".repeat(40));
        System.out.println("Silahkan Pilih Menu Update Data");
        System.out.println("=".repeat(40));
        System.out.println("1. Update Nama");
        System.out.println("2. Update Harga");
        System.out.println("3. Update Jumlah");
        System.out.println("4. Back to Menu");

        System.out.println("=".repeat(40));
        System.out.print("Pilihan: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    showEditNama(nama);
                    break;
                case 2:
                    showEditHarga(nama);
                    break;
                case 3:
                    showEditJumlah(nama);
                    break;
                case 4:
                    Menu.showMenu();
                    break;
                default:
                    System.out.println("=".repeat(40));
                    System.out.println("Maaf Nama Produk atau Menu yang Dipilih Tidak Ada");
                    System.out.println("-".repeat(40));
                    Menu.showMenu();
            }
        } catch (Exception e) {
            System.out.println("=".repeat(40));
            System.out.println("Maaf Nama Produk atau Menu yang Dipilih Tidak Ada");
            System.out.println("-".repeat(40));
            Menu.showMenu();
        }
        System.out.println("-".repeat(40));
        Menu.showMenu();
        sc.close();
    }

    public static void showEditNama(String nama) {
        Scanner sc = new Scanner(System.in);
        produk produk = DbController.getProdukByNama(nama);

        System.out.println("=".repeat(40));
        System.out.println("Edit Nama");
        System.out.println("=".repeat(40));
        System.out.println("Nama Awal: " + produk.getNama());
        System.out.println("-".repeat(40));
        System.out.print("Nama Baru: ");
        String namaBaru = sc.nextLine();
        DbController.updateNama(produk.getId(), namaBaru);

        System.out.println("=".repeat(40));
        System.out.println("Berhasil Update Data Nama");
        System.out.println("-".repeat(40));
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama) {
        Scanner sc = new Scanner(System.in);
        produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Harga Awal: " + produk.getHarga());
        System.out.println("--------------------------------");
        System.out.print("Harga Baru: ");
        long hargaBaru = sc.nextLong();
        DbController.updateHarga(produk.getId(), hargaBaru);

        System.out.println("================================");
        System.out.println("Berhasil Update Data Harga");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditJumlah(String nama) {
        Scanner sc = new Scanner(System.in);
        produk produk = DbController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Jumlah Awal: " + produk.getjumlah());
        System.out.println("--------------------------------");
        System.out.print("Jumlah Baru: ");
        int jumlahBaru = sc.nextInt();
        DbController.updateStok(produk.getId(), jumlahBaru);

        System.out.println("================================");
        System.out.println("Berhasil Update Data Stok");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}

