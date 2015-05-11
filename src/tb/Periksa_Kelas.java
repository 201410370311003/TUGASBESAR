package tb;
import java.util.*;
import java.util.Scanner;

public class Periksa_Kelas extends TB  {
    private static Object change;
    public static void main (String[] team) {
    Scanner input = new Scanner(System.in); 
    Analisa_Ruang_Kelas dot = new Analisa_Ruang_Kelas();
    Analisa_Ruang_Kelas1 set = new Analisa_Ruang_Kelas1();
    
    dot.IdentitasRuangKelas();
    dot.KondisiRuangKelas();
    dot.KenyamananRuangKelas();
    dot.cetakNyamanKelas();
    dot.Keamananruangkelas();
    dot.cetakAmanKelas();
    set.SaranaKelas();
    set.cetakDataKelas();
    set.LingkunganRuangKelas();
    set.KebersihanRuangKelas();
    
    dot.cetakSemuaData();
    set.printSemuaData();
    

        if (change.equals("Cek")) {
        dot.cetakSemuaData();
        set.printSemuaData();
    }
        System.out.print("Hasil : ");
            String change = input.next();
   }
}