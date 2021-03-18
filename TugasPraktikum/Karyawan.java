/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author MOKLET-2
 */
public class Karyawan extends Person{
    private int tahunMasuk;
    private int tahunIni;
    private int gaji;
    
    //konstruktor
    public Karyawan(int gaji, int tahunMasuk, int tahunIni, String nama, int NIK, int tahunLahir){
        super(nama, NIK, tahunLahir);
        this.tahunMasuk = tahunMasuk;
        this.tahunIni = tahunIni;
        this.gaji = gaji;
    }
    //method
    public void info(){
        super.info();
        System.out.println("Tahun Masuk Karyawan   = " + this.tahunMasuk);
        System.out.println("==========================================\n");
        System.out.println("Result Gaji Karyawan");
        System.out.println("==========================================");
        System.out.println("Nama Karyawan          = " + this.nama);
        System.out.println("NIK karyawan           = "+ this.NIK);
        System.out.println("Tahun Lahir Karyawan   = " + this.tahunLahir);
        System.out.println("Umur Karyawan Sekarang = " + (this.tahunIni-this.tahunLahir) + " Tahun");
        System.out.println("Tahun Masuk Kerja      = " + (this.tahunIni-this.tahunMasuk) + " Tahun");
        System.out.println("Total Gaji             = Rp. " + this.gaji);
        System.out.println("==========================================");
        System.out.println("Gaji Karyawan          = Rp. " + this.gaji);
        System.out.println("==========================================");   
    }
}
