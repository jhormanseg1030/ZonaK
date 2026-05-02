package com.Zonak.Ejemplo.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zonak.Ejemplo.Models.Mantenimiento;

@Repository
public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Long> {

    Boolean existsByFechaAndHoraAndActivo(LocalDate fecha, LocalTime hora, Boolean activo);
    List<Mantenimiento> findByActivo_id(Long activo_id);
    List<Mantenimiento> findByDepartamento_id(Long departamento_id);
    List<Mantenimiento> findByEstado_id(Long estado_id);

    List<Mantenimiento> findByActivo_idAndActivo(Long activo_id, Boolean activo);
    
}
