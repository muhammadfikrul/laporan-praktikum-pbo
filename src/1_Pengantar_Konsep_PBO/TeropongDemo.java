public class TeropongDemo {
	public static void main(String[] args) {

		//	Buat dua objek teropong
		Teropong1941723005Fikrul trp1 = new Teropong1941723005Fikrul();
		Teropong1941723005Fikrul trp2 = new Teropong1941723005Fikrul();
		
		//	Panggil method di dalam objek sepeda
		trp1.setMerek("Celestron Cosmos");
		trp1.setJenis("Teropong Bintang");
		trp1.setBerat(15);
		trp1.setZoomMax(70);
		trp1.cetakStatus();
		
		trp2.setMerek("Celestron AstroMaster");
		trp2.setJenis("Teropong Bintang");
		trp2.setBerat(15);
		trp2.setZoomMax(90);
		trp2.cetakStatus();
	}
}

