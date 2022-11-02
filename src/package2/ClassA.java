package package2;

import package1.Mahasiswa;

public class ClassA {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim = "M0521002"; // default
        mahasiswa.nama = "Kharisma"; // private
        mahasiswa.jenisKelamin = 'L'; // protected
        mahasiswa.alamat = "Karanganyar"; // public
    }
}
