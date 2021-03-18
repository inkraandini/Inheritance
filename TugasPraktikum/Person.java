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
public class Person  {
    protected String nama;
    protected int NIK;
    protected int tahunLahir;
    
    //konstruktor
    Person(String nama, int NIK, int tahunLahir){
        this.nama = nama;
        this.NIK = NIK;
        this.tahunLahir = tahunLahir;
    }
    
    //Method
    public void info(){
        System.out.println("Input Data Pegawai");
        System.out.println("==========================================");
        System.out.println("Nama Karyawan          = " + this.nama);
        System.out.println("NIK karyawan           = "+ this.NIK);
        System.out.println("Tahun Lahir Karyawan   = " + this.tahunLahir);
        
    }
}
