public class TestMahasiswa {
	public static void main (String args[]) {
		Mahasiswa1941723005Fikrul mhs1=new Mahasiswa1941723005Fikrul();
		Mahasiswa1941723005Fikrul mhs2=new Mahasiswa1941723005Fikrul();
		Mahasiswa1941723005Fikrul mhs3=new Mahasiswa1941723005Fikrul();

		mhs1.nim=101;
		mhs1.nama="Lestari";
		mhs1.alamat="Jl. Vinolia No. 1A";
		mhs1.kelas="1A";
		mhs1.tampilBiodata();
		mhs1.nim=102;
		mhs1.nama="Alam";
		mhs1.alamat="Jl. Bima No. 24B";
		mhs1.kelas="1B";
		mhs1.tampilBiodata();
		mhs3.nim=103;
		mhs3.nama="Nusa";
		mhs3.alamat="Jl. Sakti No. 28C";
		mhs3.kelas="1C";
		mhs3.tampilBiodata();
	}
}