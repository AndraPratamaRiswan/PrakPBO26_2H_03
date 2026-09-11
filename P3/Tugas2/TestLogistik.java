package P3.Tugas2;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: "+kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: "+kontainerAlfa.getKapasitasMaksimal()+" Kg");

        // System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        // kontainerAlfa.tambahMuatan(6000);
        // System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+" Kg");

        // System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        // kontainerAlfa.tambahMuatan(4000);
        // System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+" Kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        // kontainerAlfa.turunkanMuatan(500);
        // System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+" Kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        // kontainerAlfa.turunkanMuatan(1500);
        // System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+" Kg");

        do{
            System.out.println("\nPilih Menu");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Muatan Baru: ");
                    int newBerat = sc.nextInt();
                    kontainerAlfa.tambahMuatan(newBerat);
                    System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+" Kg");
                    break;
                case 2:
                    System.out.print("Berat Muatan Turun: ");
                    int newTurun = sc.nextInt();
                    kontainerAlfa.turunkanMuatan(newTurun);
                    System.out.println("Berat muatan saat ini: "+kontainerAlfa.getBeratMuatanSaatIni()+" Kg");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }while(pilihan !=0);
    }
}
