package com.pbo;

interface TugasMahasiswa{
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}

class Mahasiswa implements TugasMahasiswa{
    public Mahasiswa(){
        System.out.println("Tugas mahasiswa Adalah :");
    }

    @Override
    public void Kuliah(){
        System.out.println("1. Kuliah tepat waktu");
    }

    @Override
    public void BelajarMandiri(){
        System.out.println("2. Belajar Mandiri Rajin Membaca");
    }

    @Override
    public void MengembangkanDiri(){
        System.out.println("3. Mengembangkan diri melalui pelatihan dan komunitas");
    }
}

public class Main {

    public static void main(String[] args) {
	Mahasiswa Adhyt = new Mahasiswa();

	Adhyt.Kuliah();
	Adhyt.BelajarMandiri();
	Adhyt.MengembangkanDiri();
    }
}
