package com.Zonak.Ejemplo.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.Zonak.Ejemplo.Models.Mantenimiento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MantenimientoDto {

    private Long id;
    private LocalDate fechaInicio;
    private LocalTime horaInicio;
    private BigDecimal costo;
    private String descripcion;
   
    //--------------------------------------------//
    private Long activo_id;
    private String activo_nombre;
    //--------------------------------------------//
    private Long departamento_id;
    private String departamento_nombre;
    //--------------------------------------------//
    private Long estado_id;
    private String estado_nombre;
    //--------------------------------------------//

    public MantenimientoDto(Mantenimiento mantenimiento){
        this.id = mantenimiento.getId();
        this.fechaInicio = mantenimiento.getFecha();
        this.horaInicio =  mantenimiento.getHora();
        this.costo = mantenimiento.getCosto();
        this.descripcion = mantenimiento.getDescripcion();
        //--------------------------------------------//

        //Datos con la relacion con activo
        if (mantenimiento.getActivo() != null) {
            this.activo_id = mantenimiento.getActivo().getId();
            this.activo_nombre = mantenimiento.getActivo().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con departamento
        if (mantenimiento.getDepartamento() != null) {
            this.departamento_id = mantenimiento.getDepartamento().getId();
            this.departamento_nombre = mantenimiento.getDepartamento().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con estado
        if (mantenimiento.getEstado() != null) {
            this.estado_id = mantenimiento.getEstado().getId();
            this.estado_nombre = mantenimiento.getEstado().getNombre();
        }
    }
}
