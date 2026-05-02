package com.Zonak.Ejemplo.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.Zonak.Ejemplo.Models.Activo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivoDto {

    private Long id;
    private String nombre;
    private String modelo;
    private String numero_serial;
    private String anydesh;
    private String proovedor;
    private String periodo_mantenimiento;
    private LocalDate fecha;
    private BigDecimal valor;
    private String descripcion;
    private Boolean activo;
    //--------------------------------------------//
    private Long empresa_id;
    private String empresa_nombre;
    //--------------------------------------------//
    private Long usuario_id;
    private String usuario_nombre;
    //--------------------------------------------//
    private Long prioridad_id;
    private String prioridad_nombre;
    //--------------------------------------------//

    public ActivoDto(Activo activo){
        this.id = activo.getId();
        this.nombre = activo.getNombre();
        this.modelo = activo.getModelo();
        this.numero_serial = activo.getNumero_serial();
        this.anydesh = activo.getAnydesh();
        this.proovedor = activo.getProovedor();
        this.periodo_mantenimiento = activo.getPeriodo_mantenimiento();
        this.fecha = activo.getFecha();
        this.valor = activo.getValor();
        this.descripcion = activo.getDescripcion();
        this.activo = activo.getActivo();
        //--------------------------------------------//
        //Datos con la relacion con empresa
        if (activo.getEmpresa() != null) {
            this.empresa_id = activo.getEmpresa().getId();
            this.empresa_nombre = activo.getEmpresa().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con usuario
        if (activo.getUsuario() != null) {
            this.usuario_id = activo.getUsuario().getId();
            this.usuario_nombre = activo.getUsuario().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con prioridad
        if (activo.getPrioridad() != null) {
            this.prioridad_id = activo.getPrioridad().getId();
            this.prioridad_nombre = activo.getPrioridad().getNombre();
        }
    }
}
