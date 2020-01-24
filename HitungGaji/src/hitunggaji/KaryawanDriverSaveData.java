package hitunggaji;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class KaryawanDriverSaveData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nama, nik;
        int jumlahKehadiran, jumlahLembur;
        double uangTransport, uangMakan, uangLembur;

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
            uangTransport = karyawan.uangTransport(jumlahKehadiran);
            uangMakan = karyawan.uangMakan(jumlahKehadiran);
            uangLembur = karyawan.uangLembur(jumlahLembur);

            System.out.print(" ");
            System.out.println("-----------------------------------------");
            System.out.println(karyawan);
            System.out.println(" ");
            try{
                PrintWriter myFile = new PrintWriter("gajiKaryawan.txt");
                myFile.println("----------------------------------");
                myFile.println("Nama Karyawan = " + karyawan.getNama());
                myFile.println("NIK = " + karyawan.getNik());
                myFile.println("Jumlah Kehadiran = " + jumlahKehadiran + " hari");
                myFile.println("Jumlah Lembur = " + jumlahLembur + " hari");
                myFile.println(" ");
                myFile.println("Gaji pokok = " + karyawan.getGajiPokok());
                myFile.println("Uang makan = " + uangMakan);
                myFile.println("Tunjangan transport = " + uangTransport);
                myFile.println("Tunjangan kesehatan = " + karyawan.tunjanganBpjs());
                myFile.println("Uang lembur = " + uangLembur);
                myFile.println("TOTAL GAJI = Rp" + karyawan.getTotalGaji());
                myFile.println("----------------------------------");
                myFile.close();
            } catch(IOException e){
                System.out.println("Terjadi Error");
                e.printStackTrace();
            }

            System.out.print("Apakah anda ingin memasukkan data karyawan? (Ya / Tidak) : ");
            verifikasi = scanner.nextLine();
        }

        scanner.close();
    }
}
