package hitunggaji;

public class Karyawan {
    private String nama, nik;
    private double gajiPokok = 3300000.00;
    private double bpjs = 200000.00;
    private double uangLembur = 50000;
    private double gaji = 0;
    private double uangMakan = 65000;
    private double uangTransport = 50000;

    public Karyawan(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public String getNik(){
        return nik;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double tunjanganBpjs(){
        return bpjs;
    }

    public double uangLembur(double jamLembur){
        return this.uangLembur = this.uangLembur * jamLembur;
    }

    public double uangTransport(int jumlahKehadiran){
        return this.uangTransport = jumlahKehadiran * this.uangTransport;
    }

    public double uangMakan(int jumlahKehadiran){
        return this.uangMakan = jumlahKehadiran * this.uangMakan;
    }

    public double getTotalGaji(){
        System.out.println("******************************************");
        System.out.println("Gaji Pokok = " + this.gajiPokok);
        System.out.println("Tunjangan Kesehatan = " + this.bpjs);
        System.out.println("Tunjangan Transport = " + this.uangTransport);
        System.out.println("Tunjangan Makan = " + this.uangMakan);

        if(uangLembur != 0){
            this.gaji = this.gajiPokok + this.bpjs + this.uangMakan + this.uangTransport + this.uangLembur;
            System.out.println("Uang Lembur = " + this.uangLembur);
        }
        else {
            this.gaji = this.gajiPokok + this.bpjs + this.uangMakan + this.uangTransport;
        }
        System.out.print("Gaji total = ");
        return this.gaji;
    }
    public String toString(){
        return "Karyawan " + this.getNama() + ", NIK = " + this.getNik();
    }
}
