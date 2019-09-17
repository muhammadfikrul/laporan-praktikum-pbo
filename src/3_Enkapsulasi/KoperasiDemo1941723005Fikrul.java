public class KoperasiDemo1941723005Fikrul {
	public static void main(String[] args) {
		Anggota1941723005Fikrul anggota1 = new Anggota1941723005Fikrul("Iwan", "Jalan Mawar");
		
		System.out.println("Simpanan " +anggota1.getNama()+ " : Rp"+ anggota1.getSimpanan());

		anggota1.setNama("Iwan Setiawan");
		anggota1.setAlamat("Jalan Sukarno Hatta no 10");
		anggota1.setor(100000);
		System.out.println("Simpanan " +anggota1.getNama()+ " : Rp"+ anggota1.getSimpanan());
		
		anggota1.pinjam(5000);
		System.out.println("Simpanan " +anggota1.getNama()+ " : Rp"+ anggota1.getSimpanan());
	}
}