package com.example.Mapping_practice.service;

import com.example.Mapping_practice.model.Laptop;
import com.example.Mapping_practice.model.Student;
import com.example.Mapping_practice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;
    public List<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }

    public void createAllLaptop(List<Laptop> laptops) {
        laptopRepo.saveAll(laptops);
    }

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public String updateLaptopPrice(Long id, Integer price) {
        Optional<Laptop> laptopDetails=laptopRepo.findById(id);
        Laptop myLaptop = null;
        if(laptopDetails.isPresent())
        {
            myLaptop = laptopDetails.get();
        }
        else {
            return "Id not Found!!!";
        }
        myLaptop.setPrice(price);
        laptopRepo.save(myLaptop);
        return "Laptop Price updated";
    }

    public String deleteLaptopDetail(Long id) {
        laptopRepo.deleteById(id);
        return "Laptop deleted successfully";
    }
}
