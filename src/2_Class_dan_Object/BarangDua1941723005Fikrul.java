public class BarangDua1941723005Fikrul {
	public String kode;
	public String namaBarang;
	public int hargaDasar;
	public int diskon;

	public int hitungHargaJual(int diskon) {
	int hargaJual=hargaDasar-hargaDasar*diskon/100;
	return hargaJual;
	}

	public void tampilData() {
		System.out.println ("Kode        : " +kode);
		System.out.println ("Nama Barang : " +namaBarang);
		System.out.println ("Harga Dasar : Rp." +hargaDasar);
		System.out.println ("Diskon      : " +diskon + " %");
	}
}