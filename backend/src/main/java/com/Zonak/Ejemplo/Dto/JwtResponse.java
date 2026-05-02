package com.Zonak.Ejemplo.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String username;
    private String password;
    private String rol;
    private String nombre;
    private String apellido;

    public JwtResponse(String token, String username, String password, String rol, String nombre, String apellido){
        this.token = token;
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
