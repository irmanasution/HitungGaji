package hitunggaji;

public class KaryawanDriver {
    public static void main(String[] args){
        Karyawan irma = new Karyawan("Irma Nasution", "12045601134");
        irma.uangTransport(17);
        irma.uangMakan(17);
        irma.uangLembur(6);

        System.out.println(irma);
        System.out.println(irma.getTotalGaji());
    }
}
