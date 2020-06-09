package codegym.onthimodule2.repository;

import codegym.onthimodule2.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
