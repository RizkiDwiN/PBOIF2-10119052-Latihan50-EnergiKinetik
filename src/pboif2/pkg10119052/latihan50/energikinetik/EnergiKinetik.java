package pboif2.pkg10119052.latihan50.energikinetik;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * energi kinetik berbasis objek
 * 
 */
public class EnergiKinetik {
    private double massa,kecepatan;
    private final double kecepatan1 = 0; 
    public double hasil,usaha;

    EnergiKinetik(double massa, double kecepatan) {
        this.massa=massa;
        this.kecepatan=kecepatan;
        
    }

    public double getUsaha() {
        return usaha = 1*massa*((kecepatan*kecepatan)-(kecepatan1*kecepatan1))/2;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getHasil() {
        return hasil=0.5*massa*kecepatan*kecepatan;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    
    
public void tampil(){
    System.out.println("Energi kinetik : "+getHasil());
    System.out.println("Usaha : "+getUsaha());
}
}
