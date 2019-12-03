/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author muham
 */
public class Buku1941723005Fikrul {

    private int idbuku;
    private Kategori1941723005Fikrul kategori = new Kategori1941723005Fikrul();
    private String judul, penerbit, penulis;

    public int getIdbukuFikrul() {
        return idbuku;
    }

    public void setIdbukuFikrul(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1941723005Fikrul getKategoriFikrul() {
        return kategori;
    }

    public void setKategoriFikrul(Kategori1941723005Fikrul kategori) {
        this.kategori = kategori;
    }

    public String getJudulFikrul() {
        return judul;
    }

    public void setJudulFikrul(String judul) {
        this.judul = judul;
    }

    public String getPenerbitFikrul() {
        return penerbit;
    }

    public void setPenerbitFikrul(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulisFikrul() {
        return penulis;
    }

    public void setPenulisFikrul(String penulis) {
        this.penulis = penulis;
    }

    public Buku1941723005Fikrul() {
    }

    public Buku1941723005Fikrul(Kategori1941723005Fikrul kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public Buku1941723005Fikrul getByIdFikrul(int id) {
        Buku1941723005Fikrul buku = new Buku1941723005Fikrul();
        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, "
                + "b.penulis AS penulis, "
                
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

    public ArrayList<Buku1941723005Fikrul> getAllFikrul() {
        ArrayList<Buku1941723005Fikrul> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penulis, "
                + "b.penulis AS penerbit, "
                
                + "k.nama AS nama "
                
                + "FROM buku b "
                + "INNER JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while (rs.next()) {
                Buku1941723005Fikrul buku = new Buku1941723005Fikrul();
                buku.setIdbukuFikrul(rs.getInt("idbuku"));
                
                buku.getKategoriFikrul().setNamaFikrul(rs.getString("nama"));
                
                buku.setJudulFikrul(rs.getString("judul"));
                buku.setPenerbitFikrul("penulis");
                buku.setPenulisFikrul("penerbit");

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1941723005Fikrul> searchFikrul(String keyword) {
        ArrayList<Buku1941723005Fikrul> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                
                + " k.nama AS nama "
                
                + "FROM buku b "
                + "INNER JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.judul LIKE '%" + keyword + "%' "
                + "OR b.penerbit LIKE '%" + keyword + "%' "
                + "OR b.penulis LIKE '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Buku1941723005Fikrul buku = new Buku1941723005Fikrul();
                buku.setIdbukuFikrul(rs.getInt("idbuku"));
                
                buku.getKategoriFikrul().setNamaFikrul(rs.getString("nama"));
                
                buku.setJudulFikrul(rs.getString("judul"));
                buku.setPenerbitFikrul(rs.getString("penerbit"));
                buku.setPenulisFikrul(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveFikrul() {
        if (getByIdFikrul(idbuku).getIdbukuFikrul() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "     '" + this.judul + "', "
                    + "     '" + this.getKategoriFikrul().getIdkategoriFikrul() + "', "
                    + "     '" + this.penulis + "', "
                    + "     '" + this.penerbit + "'"
                    + ")";
            this.idbuku = DBHelper1941723005Fikrul.insertQueryGetIdFikrul(SQL);
        } else {
            String SQL = "UPDATE buku SET "
                    + "judul = '" + this.judul + "', "
                    + "idkategori = '" + this.getKategoriFikrul().getIdkategoriFikrul() + "', "
                    + "penulis = '" + this.judul + "', "
                    + "penerbit = '" + this.penerbit + "'"
                    + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper1941723005Fikrul.executeQuery(SQL);
        }
    }

    public void deleteFikrul() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1941723005Fikrul.executeQuery(SQL);
    }
}
