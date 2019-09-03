public class SepedaDemoMainPlusGunung {

	public static void main(String[] args) {
		
		//	Buat dua objek sepeda
		Sepeda1941723005Fikrul spd1 = new Sepeda1941723005Fikrul();
		Sepeda1941723005Fikrul spd2 = new Sepeda1941723005Fikrul();
		SepedaGunung spd3 = new SepedaGunung();
		
		//	Panggil method di dalam objek sepeda
		spd1.setMerek("Polygon");
		spd1.tambahKecepatan(10);
		spd1.gantiGear(2);
		spd1.cetakStatus();
		
		spd2.setMerek("Wim Cycle");
		spd2.tambahKecepatan(10);
		spd2.gantiGear(3);
		spd2.cetakStatus();

		spd3.setMerek("Klinee");
		spd3.tambahKecepatan(5);
		spd3.gantiGear(7);
		spd3.setTipeSuspensi("Gas suspension");
		spd3.cetakStatus();
	}
}