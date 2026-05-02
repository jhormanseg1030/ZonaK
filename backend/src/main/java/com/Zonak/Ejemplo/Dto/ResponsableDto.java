package com.Zonak.Ejemplo.Dto;

import com.Zonak.Ejemplo.Models.Responsable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsableDto {

    private Long id;
    private String nombre;
    private String numero_identificacion;
    private String numero_celular;
    private Boolean activo;
    //--------------------------------------------//
    private Long usuario_id;
    private String usuario_nombre;
    //--------------------------------------------//

    public ResponsableDto(Responsable responsable){
        this.id = responsable.getId();
        this.nombre = responsable.getNombre();
        this.numero_identificacion = responsable.getNumero_identificacion();
        this.numero_celular = responsable.getNumero_telefono();
        this.activo = responsable.getActivo();
        //--------------------------------------------//

        if (responsable.getUsuario() != null) {
            this.usuario_id = responsable.getUsuario().getId();
            this.usuario_nombre = responsable.getUsuario().getNombre();
        }
    }
}
