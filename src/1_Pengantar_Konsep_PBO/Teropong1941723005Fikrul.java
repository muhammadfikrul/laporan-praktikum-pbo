public class Teropong1941723005Fikrul {
	
	private String merek;
	private String jenis;
	private int berat;
	private int zoomMax;

	public void setMerek(String newValue) {
		merek = newValue;
	}

	public void setJenis(String newValue) {
		jenis = newValue;
	}

	public void setBerat(int newValue) {
		berat = newValue;
	}

	public void setZoomMax(int newValue) {
		zoomMax = newValue;
	}

	public void cetakStatus() {
		System.out.println("Merek: " + merek);
		System.out.println("Jenis: " + jenis);
		System.out.println("Berat: " + berat + " kg");
		System.out.println("Perbesaran Maksimal: " + zoomMax + " kali");
	}
}



