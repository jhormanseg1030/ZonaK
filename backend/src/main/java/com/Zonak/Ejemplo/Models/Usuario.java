package com.Zonak.Ejemplo.Models;

import java.time.LocalDate;


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
@Table(name = "Usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String nombre;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String apellido;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String cargo;

    @NotBlank
    @Column(nullable = false, unique = false)
    private String correo;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String numero;

    @NotBlank
    @Column(nullable = false)
    private String password;

    @NotBlank
    @Column(nullable = false, unique = true)
    private Role rol;

    @NotBlank
    @Column(nullable = false, unique = true)
    private LocalDate fecha_contratacion = LocalDate.now();

    @NotBlank
    @Column(nullable = false)
    private Boolean activo = true;

    public enum Role{
        ADMIN,
        USER
    }
}
