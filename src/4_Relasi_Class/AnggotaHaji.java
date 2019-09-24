public class AnggotaHaji {

	private String ktp;
	private String nama;

    public AnggotaHaji() {
    }

    public AnggotaHaji(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
	/**
	 * 
	 * @param ktp
	 */
	public void setKtp(String ktp) {
		this.ktp = ktp;
	}

	/**
	 * 
	 * @param nama
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKtp() {
		return this.ktp;
	}

	public String getNama() {
		return this.nama;
	}

	public String info() {
		String info = "\n";
                info += "Ktp: " + ktp + "\n";
                info += "Nama: " + nama + "\n";
                return info;
	}

}