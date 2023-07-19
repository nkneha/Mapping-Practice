package com.example.Mapping_practice.service;

import com.example.Mapping_practice.model.Address;
import com.example.Mapping_practice.model.Book;
import com.example.Mapping_practice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public void createAllAddress(List<Address> addresses) {
        addressRepo.saveAll(addresses);
    }

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public String updateZipcode(Long id, String zipcode) {
        Optional<Address> addressDetails=addressRepo.findById(id);
        Address myAddress = null;
        if(addressDetails.isPresent())
        {
            myAddress = addressDetails.get();
        }
        else {
            return "Id not Found!!!";
        }
        myAddress.setZipcode(zipcode);
        addressRepo.save(myAddress);
        return "Address zipcode updated";
    }

    public String deleteAddressDetail(Long id) {
        addressRepo.deleteById(id);
        return "Address deleted successfully";
    }
}
