/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author tr
 */
public class Uyeler {

    private int id;
    private Magaza magaza;
    private String adSoyad;
    private String adres;
    private String posta;
    private String telefon;
    private List<Urunler> urun;

    public Uyeler() {
    }

    public Uyeler(int id, String adSoyad) {
        this.id = id;
        this.adSoyad = adSoyad;
    }

    public Uyeler(int id, Magaza magaza, String adSoyad, String adres, String posta, String telefon) {
        this.id = id;
        this.magaza = magaza;
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.posta = posta;
        this.telefon = telefon;
    }

    public Uyeler(int id, Magaza magaza, String adSoyad, String adres, String posta, String telefon, List<Urunler> urun) {
        this.id = id;
        this.magaza = magaza;
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.posta = posta;
        this.telefon = telefon;
        this.urun = urun;
    }

   

   
    public List<Urunler> getUrun() {
        return urun;
    }

    public void setUrun(List<Urunler> urun) {
        this.urun = urun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Magaza getMagaza() {
        return magaza;
    }

    public void setMagaza(Magaza magaza) {
        this.magaza = magaza;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Uyeler other = (Uyeler) obj;
        return this.id == other.id;
    }

}
