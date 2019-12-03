/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author muham
 */
public class Peminjaman1941723005Fikrul {
   
    private int idpeminjaman;
    private Anggota1941723005Fikrul anggota = new Anggota1941723005Fikrul();
    private Buku1941723005Fikrul buku = new Buku1941723005Fikrul();
    private String tanggalpinjam, tanggalkembali;

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1941723005Fikrul getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota1941723005Fikrul anggota) {
        this.anggota = anggota;
    }

    public Buku1941723005Fikrul getBuku() {
        return buku;
    }

    public void setBuku(Buku1941723005Fikrul buku) {
        this.buku = buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman1941723005Fikrul() {
    }

    public Peminjaman1941723005Fikrul(Anggota1941723005Fikrul anggota, Buku1941723005Fikrul buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    
    public Peminjaman1941723005Fikrul getByIdFikrul(int id) {
        Peminjaman1941723005Fikrul peminjaman = new Peminjaman1941723005Fikrul();
        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.penulis AS penulis, "
                
                + "k.nama AS nama "
                
                + "FROM buku b "
                + "INNER JOIN kategori k ON k.idkategori = b.idkategori "
                + "WHERE b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1941723005Fikrul();
                buku.setIdbukuFikrul(rs.getInt("idbuku"));
                
                buku.getKategoriFikrul().setNamaFikrul(rs.getString("nama"));
                
                buku.setJudulFikrul(rs.getString("judul"));
                buku.setPenerbitFikrul("penerbit");
                buku.setPenulisFikrul(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
        )
                
    }
    
}
