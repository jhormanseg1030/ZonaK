package com.Zonak.Ejemplo.Models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Agenda")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String titulo;

    @NotBlank
    @Column(nullable = false, unique = true)
    private LocalDate fecha;

    @NotBlank
    @Column(nullable = false, unique = true)
    private LocalTime horaI = LocalTime.now();

    @NotBlank
    @Column(nullable = false, unique = true)
    private LocalTime horaF = LocalTime.now();
    
    @NotBlank
    @Column(nullable = false)
    private Boolean activo = true;

    private String descripcion;

}
