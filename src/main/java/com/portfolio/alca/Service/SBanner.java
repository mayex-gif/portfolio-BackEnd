/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.alca.Service;

import com.portfolio.alca.Entity.Banner;
import com.portfolio.alca.Repository.RBanner;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SBanner {
    @Autowired
    RBanner rBanner;
    
    public List<Banner> list(){
        return rBanner.findAll();
    }
    
    public Optional<Banner> getOne(int id){
        return rBanner.findById(id);
    }
    
    public Optional<Banner> getByImgB(String imgB){
        return rBanner.findByImgB(imgB);
    }
    
    public void save(Banner banner){
        rBanner.save(banner);
    }
    
    public void delete(int id){
        rBanner.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rBanner.existsById(id);
    }
    
    public boolean existsByImgB(String imgB){
        return rBanner.existsByImgB(imgB);
    }
}
