package com.github.edsonluiz.omnistack11_backend_spring.models.services;

import com.github.edsonluiz.omnistack11_backend_spring.models.entities.Ong;
import java.util.List;

public interface OngService {
  public List<Ong> findAll();
  public Ong findById(String id);
  public Ong save(Ong ong);
  public void deleteById(String id);
}
