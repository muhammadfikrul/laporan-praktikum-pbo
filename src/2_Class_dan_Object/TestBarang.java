public class TestBarang {
	public static void main (String args[]) {
		Barang1941723005Fikrul brg1 = new Barang1941723005Fikrul();
		brg1.namaBrg="Pensil";
		brg1.jenisBrg="ATK";
		brg1.stok=10;
		brg1.tampilBarang();
		System.out.println("Stok Baru adalah " +brg1.tambahStok(20));
	}
}