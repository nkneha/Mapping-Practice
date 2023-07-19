package com.example.Mapping_practice.controller;

import com.example.Mapping_practice.model.Laptop;
import com.example.Mapping_practice.model.Student;
import com.example.Mapping_practice.service.LaptopService;
import com.example.Mapping_practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @GetMapping("laptops")
    public List<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();
    }
    @PostMapping("laptops")
    public void addAllLaptops(@RequestBody List<Laptop> laptops){
        laptopService.createAllLaptop(laptops);
    }
    @PostMapping("laptop")
    public void addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
    }
    @PutMapping("laptop/id/{id}")
    public String updateLaptopPrice(@PathVariable Long id, @RequestParam Integer price){
        return laptopService.updateLaptopPrice(id,price);

    }
    @DeleteMapping("laptop/id/{id}")
    public String deleteLaptopById(@PathVariable Long id){
        return laptopService.deleteLaptopDetail(id);

    }
}
