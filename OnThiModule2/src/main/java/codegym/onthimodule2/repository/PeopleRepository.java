package codegym.onthimodule2.repository;

import codegym.onthimodule2.model.People;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People,Integer> {
    Page<People> findAllByNameContainingOrJobContainingOrderByName (String name,String job,Pageable pageable);
}
