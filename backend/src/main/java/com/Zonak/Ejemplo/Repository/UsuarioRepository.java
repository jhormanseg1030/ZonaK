package com.Zonak.Ejemplo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zonak.Ejemplo.Models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByCorreo(String correo);
    Boolean existsByCorreo(String correo);
    Boolean existsByUsername(String username);
    List<Usuario>findByRol(Usuario.Role rol);
    List<Usuario>findByActivo(Boolean activo);
}
