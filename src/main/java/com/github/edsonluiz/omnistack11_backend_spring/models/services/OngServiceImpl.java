package com.github.edsonluiz.omnistack11_backend_spring.models.services;

import com.github.edsonluiz.omnistack11_backend_spring.models.entities.Ong;
import com.github.edsonluiz.omnistack11_backend_spring.models.repositories.OngRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OngServiceImpl implements OngService {

  @Autowired
  private OngRepository ongRepository;

  @Override
  public List<Ong> findAll() {
    return ongRepository.findAll();
  }

  @Override
  public Ong findById(Long id) {
    return ongRepository.findById(id).orElse(null);
  }

  @Override
  public Ong save(Ong ong) {
    return ongRepository.save(ong);
  }

  @Override
  public void deleteById(Long id) {
    ongRepository.deleteById(id);
  }
}
