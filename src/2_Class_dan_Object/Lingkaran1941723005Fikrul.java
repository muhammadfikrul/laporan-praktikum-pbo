public class Lingkaran1941723005Fikrul {
	public double phi;
	public double r;

	public void tampilPhiR() {
		System.out.println ("Phi   : " +phi);
		System.out.println ("r     : " +r);
	}
	
	public double hitungLuas(double phi) {
	double luas = phi*r*r;
	return luas;
	}
}