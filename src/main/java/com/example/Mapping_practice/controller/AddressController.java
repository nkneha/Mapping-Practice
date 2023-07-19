package com.example.Mapping_practice.controller;

import com.example.Mapping_practice.model.Address;
import com.example.Mapping_practice.model.Book;
import com.example.Mapping_practice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @PostMapping("addresses")
    public void addAllAddress(@RequestBody List<Address> addresses){
        addressService.createAllAddress(addresses);
    }
    @PostMapping("address")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
    @PutMapping("address/id/{id}")
    public String updateZipcode(@PathVariable Long id, @RequestParam String zipcode){
        return addressService.updateZipcode(id,zipcode);

    }
    @DeleteMapping("address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressDetail(id);

    }
}
