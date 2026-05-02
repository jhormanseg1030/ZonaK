package com.Zonak.Ejemplo.Dto;

import com.Zonak.Ejemplo.Models.Departamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentoDto {

    private Long id;
    private String nombre_departamento;
    private String direccion;
    private Boolean activo;
    //--------------------------------------------//
    private Long empresa_id;
    private String empresa_nombre;
    //--------------------------------------------//
    private long estado_id;
    private String estado_nombre;

    public DepartamentoDto(Departamento departamento){
        this.id = departamento.getId();
        this.nombre_departamento = departamento.getNombre();
        this.direccion = departamento.getDireccion();
        this.activo = departamento.getActivo();
        //--------------------------------------------//
        //Datos con la relacion con empresa
        if (departamento.getEmpresa()!= null) {
            this.empresa_id = departamento.getEmpresa().getId();
            this.empresa_nombre = departamento.getEmpresa().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con estado
        if (departamento.getEstado()!= null) {
            this.estado_id = departamento.getEstado().getId();
            this.estado_nombre = departamento.getEstado().getNombre();
        }
    }
}
