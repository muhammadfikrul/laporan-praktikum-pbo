public class BarangDuaMain {
	public static void main (String args[]) {
		BarangDua1941723005Fikrul brg1 = new BarangDua1941723005Fikrul();
		brg1.kode="AB123";
		brg1.namaBarang="Buku Tulis";
		brg1.hargaDasar=5000;
		brg1.diskon=25;
		brg1.tampilData();
		System.out.println("Harga Jual adalah Rp." +brg1.hitungHargaJual(25));
	}
}