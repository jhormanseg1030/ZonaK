package com.Zonak.Ejemplo.Models;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Table(name = "Activo")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Activo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String nombre;

    private String modelo;

    private String numero_serial;

    private String anydesh;

    private String proovedor;

    private String periodo_mantenimiento;

    private LocalDate fecha;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;
    
    private String descripcion;

    @NotBlank
    @Column(nullable = false)
    private Boolean activo = true;

//---------------------------------------------------------------------------//

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prioridad_id")
    private Prioridad prioridad;
}
