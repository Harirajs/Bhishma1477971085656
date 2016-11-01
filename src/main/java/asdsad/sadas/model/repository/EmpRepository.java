package asdsad.sadas.model.repository;

import asdsad.sadas.model.*;

import java.util.Date;
import asdsad.sadas.model.Dept;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmpRepository extends JpaRepository<Emp, Long>{

}



