package codegym.onthimodule2.service.impl;

import codegym.onthimodule2.model.Address;
import codegym.onthimodule2.repository.AddressRepository;
import codegym.onthimodule2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}
