package com.Zonak.Ejemplo.Models;

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
@Table(name = "Responsable")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Responsable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String nombre;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String numero_identificacion;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String numero_telefono;

    @NotBlank
    @Column(nullable = false)
    private Boolean activo = true;
//---------------------------------------------------------------------------//

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
