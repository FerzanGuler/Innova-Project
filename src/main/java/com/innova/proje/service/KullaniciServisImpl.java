package com.innova.proje.service;


import com.innova.proje.dao.KullaniciRepository;
import com.innova.proje.entity.kullanici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciServisImpl implements KullaniciServis{
    KullaniciRepository kullaniciRepository;

    @Autowired
    public KullaniciServisImpl(KullaniciRepository theKullaniciRepository){
        kullaniciRepository = theKullaniciRepository;
    }
    @Override
    public List<kullanici> findAll(){
        return kullaniciRepository.findAll();
    }

    @Override
    public kullanici findById(int id){
        Optional<kullanici> result = kullaniciRepository.findById(id);
        kullanici kl =null;
        if(result.isPresent()){
            kl=result.get();
        }else {
            throw new RuntimeException("Kullanici bulunamadi");
        }
        return kl;
    }

    @Override
    public kullanici save(kullanici theKullanici){
        return kullaniciRepository.save(theKullanici);
    }

    @Override
    public void deleteById(int id){
        kullaniciRepository.deleteById(id);
    }


}
