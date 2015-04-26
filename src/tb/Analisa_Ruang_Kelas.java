package tb;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Analisa_Ruang_Kelas {

    Scanner input = new Scanner(System.in);
    TB kelas = new TB();
    
    public void IdentitasRuangKelas() {
    System.out.println("Nama Ruangan : ");
    String NamaRuangan = input.next();
    kelas.setNamaRuangan(NamaRuangan);
    System.out.println("Lokasi : ");
    String LokasiRuangan = input.next();
    kelas.setLokasiRuangan(LokasiRuangan);
    System.out.println("Jurusan : ");
    String Jurusan = input.next();
    kelas.setJurusan(Jurusan);
    System.out.println("");
}
    
    public void KondisiRuangKelas() {
    System.out.print("Masukkan Panjang : ");
    int Panjang = input.nextInt();
    kelas.setPanjang(Panjang);
    System.out.print("Masukkan Lebar : ");
    int Lebar = input.nextInt();
    kelas.setLebar(Lebar);
    
    kelas.setLuas(kelas.getPanjang() * kelas.getLebar());
    
    if (Panjang == Lebar) {
    kelas.setBentukRuang("Persegi Panjang");
    }
        
    System.out.print("Jumlah Pintu : ");
    int JumlahPintu = input.nextInt();
    kelas.setJumlahPintu(JumlahPintu);
    System.out.print("Jumlah Kursi : ");
    int JumlahKursi = input.nextInt();
    kelas.setJumlahKursi(JumlahKursi);
    System.out.print("Jumlah Jendela : ");
    int JumlahJendela = input.nextInt();
    kelas.setJumlahJendela(JumlahJendela);
    
    kelas.setRasioLuas(kelas.getLuas() / kelas.getJumlahJendela());
    if(kelas.getJumlahPintu() >=2) {
    kelas.DataKelas();
    }
    else if(kelas.getJumlahPintu() >=1)
    {
    kelas.DataKelas();
    }
    System.out.println("Sesuai");
    }
}
    