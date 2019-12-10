/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import java.sql.*;
import unittest.database.DBHelper1941723005Fikrul;

/**
 *
 * @author muham
 */
public class Anggota1941723005Fikrul {

    private int idanggota;
    private String nama, alamat, telepon;

    public int getIdanggotaFikrul() {
        return idanggota;
    }

    public void setIdanggotaFikrul(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNamaFikrul() {
        return nama;
    }

    public void setNamaFikrul(String nama) {
        this.nama = nama;
    }

    public String getAlamatFikrul() {
        return alamat;
    }

    public void setAlamatFikrul(String alamat) {
        this.alamat = alamat;
    }

    public String getTeleponFikrul() {
        return telepon;
    }

    public void setTeleponFikrul(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1941723005Fikrul() {
    }

    public Anggota1941723005Fikrul(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public Anggota1941723005Fikrul getByIdFikrul(int id) {
        Anggota1941723005Fikrul ang = new Anggota1941723005Fikrul();
        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM anggota" + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                ang = new Anggota1941723005Fikrul();
                ang.setIdanggotaFikrul(rs.getInt("idanggota"));
                ang.setNamaFikrul(rs.getString("nama"));
                ang.setAlamatFikrul(rs.getString("alamat"));
                ang.setTeleponFikrul(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Anggota1941723005Fikrul> getAllFikrul() {
        ArrayList<Anggota1941723005Fikrul> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1941723005Fikrul ang = new Anggota1941723005Fikrul();
                ang.setIdanggotaFikrul(rs.getInt("idanggota"));
                ang.setNamaFikrul(rs.getString("nama"));
                ang.setAlamatFikrul(rs.getString("alamat"));
                ang.setTeleponFikrul(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1941723005Fikrul> searchFikrul(String keyword) {
        ArrayList<Anggota1941723005Fikrul> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + "nama LIKE '%" + keyword
                + "%' " + "OR alamat LIKE '%" + keyword + "%' " + "OR telepon LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper1941723005Fikrul.selectQueryFikrul(sql);

        try {
            while (rs.next()) {
                Anggota1941723005Fikrul ang = new Anggota1941723005Fikrul();
                ang.setIdanggotaFikrul(rs.getInt("idanggota"));
                ang.setNamaFikrul(rs.getString("nama"));
                ang.setAlamatFikrul(rs.getString("alamat"));
                ang.setTeleponFikrul(rs.getString("telepon"));

                ListAnggota.add(ang);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveFikrul() {
        if (getByIdFikrul(idanggota).getIdanggotaFikrul() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES (" + " '" 
                    + this.nama + "', " + "'" 
                    + this.alamat + "', " + "'" 
                    + this.telepon + "'" + ")";
            this.idanggota = DBHelper1941723005Fikrul.insertQueryGetIdFikrul(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + "nama = '" + this.nama + "', "
                    + "alamat = '" + this.alamat + "', "
                    + "telepon = '" + this.telepon + "' "
                    + "WHERE idanggota = '" + this.idanggota + "'";
            DBHelper1941723005Fikrul.executeQuery(SQL);
        }
    }

    public void deleteFikrul() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1941723005Fikrul.executeQuery(SQL);
    }
    
    public ArrayList<Anggota1941723005Fikrul> getByNamaAndAlamatAndTeleponFikrul(String nama, String alamat) {
        ArrayList<Anggota1941723005Fikrul> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori WHERE nama = '" + nama + "' and alamat = '" + alamat + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori WHERE alamat = '" + alamat + "' and telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori WHERE nama = '" + nama + "' and telepon = '" + telepon + "'"); 
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori WHERE nama = '" + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori WHERE alamat = '" + alamat + "'");
        } else {
            rs = DBHelper1941723005Fikrul.selectQueryFikrul("SELECT * FROM kategori WHERE telepon = '" + telepon + "'");
        }
        try {
            while (rs.next()) {
                Anggota1941723005Fikrul ang = new Anggota1941723005Fikrul();
                ang.setIdanggotaFikrul(rs.getInt("idanggota"));
                ang.setNamaFikrul(rs.getString("nama"));
                ang.setAlamatFikrul(rs.getString("alamat"));
                ang.setTeleponFikrul(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
}
