package com.Zonak.Ejemplo.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Mantenimiento")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Mantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private LocalDate fecha;

    private LocalTime hora;

    @NotBlank
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal costo;

    private String descripcion;
//---------------------------------------------------------------------------//

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activo_id")
    private Activo activo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_id")
    private Estado estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tecnico_id")
    private Usuario tecnico;
}
