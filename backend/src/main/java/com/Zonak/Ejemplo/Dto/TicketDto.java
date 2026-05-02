package com.Zonak.Ejemplo.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.Zonak.Ejemplo.Models.Ticket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    private Long id;
    private String correo;
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion;
    //--------------------------------------------//
    private Long estado_id;
    private String estado_nombre;
    //--------------------------------------------//
    private Long departamento_id;
    private String departamento_nombre;
    //--------------------------------------------//
    private Long categoria_id;
    private String categoria_nombre;
    //--------------------------------------------//

    public TicketDto(Ticket ticket){
        this.id = ticket.getId();
        this.correo = ticket.getCorreo();
        this.fecha = ticket.getFecha();
        this.hora = ticket.getHora();
        this.descripcion = ticket.getDescripcion();
        //--------------------------------------------//
        //Datos con la relacion con estado
        if (ticket.getEstado() != null) {
            this.estado_id = ticket.getEstado().getId();
            this.estado_nombre = ticket.getEstado().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con departamento
        if (ticket.getDepartamento() != null) {
            this.departamento_id = ticket.getDepartamento().getId();
            this.departamento_nombre = ticket.getDepartamento().getNombre();
        }
        //--------------------------------------------//
        //Datos con la relacion con categoria
        if (ticket.getCategoria() != null) {
            this.categoria_id = ticket.getCategoria().getId();
            this.categoria_nombre = ticket.getCategoria().getNombre();
        }
    }
}
