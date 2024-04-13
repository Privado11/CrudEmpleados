package com.empleados.recursos_humanos.repository;

import com.empleados.recursos_humanos.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
