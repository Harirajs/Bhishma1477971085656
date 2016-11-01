package asdsad.sadas.api.service.impl;

import asdsad.sadas.api.service.*;
import asdsad.sadas.model.*;
import org.springframework.stereotype.Service;
import asdsad.sadas.model.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import asdsad.sadas.model.Emp;

import java.util.*;
import asdsad.sadas.exception.NotFoundException;

@Service
public class EmpApiServiceImpl implements EmpApiService {
  	  @Autowired
  	  private EmpRepository empRepository ;
  	  
  
  
      @Override
      public List<Emp> findAllEmp()
      throws NotFoundException {
      
        
  		
  		
   		  List<Emp> list = empRepository.findAll();
      	  return list;
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp updateEmp(Emp emp)
      throws NotFoundException {
      
         
      	   return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp addEmp(Emp emp)
      throws NotFoundException {
      
         
      	   return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp findByIdEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		 
      	  return empRepository.findOne(id);
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  empRepository.delete(id);
  		
  		
  		
  }
  
}
