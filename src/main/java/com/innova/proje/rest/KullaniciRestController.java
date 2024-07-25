package com.innova.proje.rest;

import com.innova.proje.entity.kullanici;
import com.innova.proje.service.KullaniciServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KullaniciRestController {

    private KullaniciServis kullaniciServis;

    @Autowired
    public KullaniciRestController(KullaniciServis kullaniciServis){
        this.kullaniciServis=kullaniciServis;
    }

    //tum kulanicilar
    @GetMapping("/kullanici")
    public List<kullanici> getAll(){
        return kullaniciServis.findAll();
    }

    //id ile kullanici cagirma
    @GetMapping("/kullanici/{kullaniciId}")
    public kullanici getById(@PathVariable int kullaniciId){
        kullanici kl = kullaniciServis.findById(kullaniciId);

        if(kl == null){
            throw new RuntimeException("kullanici id bulunamadi" + kullaniciId);
        }
        return kl;
    }
    @PostMapping("/kullanici")
    public kullanici addKullanici(@RequestBody kullanici theKullanici){
        theKullanici.setId(0);

        kullanici kl = kullaniciServis.save(theKullanici);
        return kl;
    }

    @PutMapping("/kullanici")
    public kullanici updateKullanici(@RequestBody kullanici theKullanici){
        kullanici kl = kullaniciServis.save(theKullanici);
        return kl;
    }

    @DeleteMapping("/kullanici/{kullaniciId}")
    public String deleteKullanici(@PathVariable int kullaniciId){
        kullanici kl = kullaniciServis.findById(kullaniciId);

        if(kl==null){
            throw new RuntimeException("kullanici id si bulunmadi" + kullaniciId);
        }
        kullaniciServis.deleteById(kullaniciId);
        return "Basariyla Silindi";
    }




}
