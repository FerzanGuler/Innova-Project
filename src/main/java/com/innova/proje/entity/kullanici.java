package com.innova.proje.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="kullanici")
public class kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "isim")
    private String isim;

    @Column(name = "masraf")
    private float masraf;

    @Column(name = "yas")
    private String yas;

    public kullanici(){

    }

    public kullanici(String isim, float masraf, String yas) {
        this.isim = isim;
        this.masraf = masraf;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMasraf() {
        return masraf;
    }

    public void setMasraf(float masraf) {
        this.masraf = masraf;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
}
