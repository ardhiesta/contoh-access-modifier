package package2;

import package1.Mahasiswa;

public class MahasiswaInherit extends Mahasiswa { 
    void test(){
        nim = "M0521003"; // default
        nama = "Triyawan"; // private
        jenisKelamin = 'L'; // protected
        alamat = "Sragen"; // public
    }

    public static void main(String[] args) {
        
    }
}
