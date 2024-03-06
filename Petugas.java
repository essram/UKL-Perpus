
import java.util.*;

public class Petugas {  
    public static void Karyawan() {
        
        //ArrayList nama petugas
        ArrayList<String>namaPetugas = new ArrayList<String>();
        namaPetugas.add("Asep");
        namaPetugas.add("Ucok");
        namaPetugas.add("Kaori");
        namaPetugas.add("Hendra");

        //Arraylist alamat karyawan
        ArrayList<String>alamatPetugas = new ArrayList<String>();
        alamatPetugas.add("Jalanin aja dulu");
        alamatPetugas.add("Jalanin aja");
        alamatPetugas.add("Jalan jalan");
        alamatPetugas.add("Jalanin");

        //Arraylist telefon karyawan
        ArrayList<String>telefonPetugas = new ArrayList<String>();
        telefonPetugas.add("08235612169");
        telefonPetugas.add("08203132409");
        telefonPetugas.add("08678487675");
        telefonPetugas.add("08349509584");
        
        //Menampilkan data karayawan
        System.out.println("Nama Petugas: "+namaPetugas.get(0));
        System.out.println("Alamat: "+alamatPetugas.get(0));
        System.out.println("No Telepon: "+telefonPetugas.get(0));
    }
}