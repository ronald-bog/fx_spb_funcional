package com.example.fx.Repository;

import com.example.fx.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Persona, Long> {
}
