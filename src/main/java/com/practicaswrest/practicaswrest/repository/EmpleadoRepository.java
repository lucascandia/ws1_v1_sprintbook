package com.practicaswrest.practicaswrest.repository;

import com.practicaswrest.practicaswrest.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}