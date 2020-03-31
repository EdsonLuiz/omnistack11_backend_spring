package com.github.edsonluiz.omnistack11_backend_spring.models.repositories;

import com.github.edsonluiz.omnistack11_backend_spring.models.entities.Ong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OngRepository extends JpaRepository<Ong, Long> {

}
