package hitunggaji;

import java.util.Scanner;

public class KaryawanDriverUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nama, nik;
        int jumlahKehadiran, jumlahLembur;

        System.out.print("Apakah anda ingin memasukkan data karyawan? (Ya / Tidak) : ");
        String verifikasi = scanner.nextLine();

        while(verifikasi.equalsIgnoreCase("Ya")){
            System.out.print("Masukkan nama karyawan : ");
            nama = scanner.nextLine();
            System.out.print("Masukkan NIK karyawan : ");
            nik = scanner.nextLine();
            System.out.print("Masukkan jumlah kehadiran bulan ini : ");
            jumlahKehadiran = scanner.nextInt();
            System.out.print("Masukkan jumlah jam lembur bulan ini : ");
            jumlahLembur = scanner.nextInt();
            scanner.nextLine();

            Karyawan karyawan = new Karyawan(nama, nik);
            karyawan.uangTransport(jumlahKehadiran);
            karyawan.uangMakan(jumlahKehadiran);
            karyawan.uangLembur(jumlahLembur);

            System.out.print("");
            System.out.println("-----------------------------------------");
            System.out.println(karyawan);
            System.out.println(karyawan.getTotalGaji());
            System.out.println("");
            System.out.print("Apakah anda ingin memasukkan data karyawan? (Ya / Tidak) : ");
            verifikasi = scanner.nextLine();
        }
    }
}
