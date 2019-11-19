package fikrul.percobaan4;

import java.util.ArrayList;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class InputData1941723005Fikrul {

    ArrayList<Mahasiswa1941723005Fikrul> ListMahasiswa;

    public InputData1941723005Fikrul() {
        ListMahasiswa = new ArrayList();
    }

    public void isiData(String Nim, String Nama, String Alamat) {
        Mahasiswa1941723005Fikrul mhs = new Mahasiswa1941723005Fikrul(Nim, Nim, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1941723005Fikrul> getData(){
        return ListMahasiswa;
    }
}
