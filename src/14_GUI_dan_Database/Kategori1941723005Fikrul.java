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
public class Kategori1941723005Fikrul {

    private int idkategori;
    private String nama, keterangan;

    public int getIdkategoriFikrul() {
        return idkategori;
    }

    public void setIdkategoriFikrul(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamaFikrul() {
        return nama;
    }

    public void setNamaFikrul(String nama) {
        this.nama = nama;
    }

    public String getKeteranganFikrul() {
        return keterangan;
    }

    public void setKeteranganFikrul(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1941723005Fikrul() {
    }

    public Kategori1941723005Fikrul(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public Kategori1941723005Fikrul getByIdFikrul(int id) {
        Kategori1941723005Fikrul kat = new Kategori1941723005Fikrul();
        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori" + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1941723005Fikrul();
                kat.setIdkategoriFikrul(rs.getInt("idkategori"));
                kat.setNamaFikrul(rs.getString("nama"));
                kat.setKeteranganFikrul(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1941723005Fikrul> getAllFikrul() {
        ArrayList<Kategori1941723005Fikrul> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1941723005Fikrul kat = new Kategori1941723005Fikrul();
                kat.setIdkategoriFikrul(rs.getInt("idkategori"));
                kat.setNamaFikrul(rs.getString("nama"));
                kat.setKeteranganFikrul(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1941723005Fikrul> searchFikrul(String keyword) {
        ArrayList<Kategori1941723005Fikrul> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + "nama LIKE '%" + keyword
                + "%' " + "OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul(sql);

        try {
            while (rs.next()) {
                Kategori1941723005Fikrul kat = new Kategori1941723005Fikrul();
                kat.setIdkategoriFikrul(rs.getInt("idkategori"));
                kat.setNamaFikrul(rs.getString("nama"));
                kat.setKeteranganFikrul(rs.getString("keterangan"));

                ListKategori.add(kat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveFikrul() {
        if (getByIdFikrul(idkategori).getIdkategoriFikrul() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES (" + " '" + this.nama + "', " + "'" + this.keterangan + "'" + ")";
            this.idkategori = DBHelper1941723005Fikrul.insertQueryGetIdFikrul(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + "nama = '" + this.nama + "', "
                    + "keterangan = '" + this.keterangan + "' "
                    + "WHERE idkategori = '" + this.idkategori + "'";
            DBHelper1941723005Fikrul.executeQuery(SQL);
        }
    }

    public void deleteFikrul() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1941723005Fikrul.executeQuery(SQL);
    }

    public String toString() {
        return nama;
    }

}
