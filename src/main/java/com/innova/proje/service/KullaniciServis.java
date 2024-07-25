package com.innova.proje.service;

import java.util.List;
import com.innova.proje.entity.kullanici;
public interface KullaniciServis {

    List<kullanici> findAll();
    kullanici findById(int id);
    kullanici save(kullanici theKullanici);
    void deleteById(int id);

}
