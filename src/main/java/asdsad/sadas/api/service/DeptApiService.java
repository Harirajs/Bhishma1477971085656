package asdsad.sadas.api.service;

import asdsad.sadas.model.Dept;
import java.util.List;
import java.util.Set;
import asdsad.sadas.exception.NotFoundException;

public interface DeptApiService {
  
      List<Dept> findAllDept()
      throws NotFoundException;
  
      Dept updateDept(Dept dept)
      throws NotFoundException;
  
      Dept addDept(Dept dept)
      throws NotFoundException;
  
      Dept findByIdDept(Long id)
      throws NotFoundException;
  
      void deleteDept(Long id)
      throws NotFoundException;
  
}
