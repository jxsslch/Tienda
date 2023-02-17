package com.tienda_v1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
// Se coloca @Data y se crea el import, eso crea logicamente los gets y sets
// No se van a ver, pero los programa
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    // Se utiliza para que el numero de ID se asigne solo
    private static final long serialVersionUID = 1L;
    // Llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    // Constructor default, no inicializa variables

    public Cliente() {
    }

    // Constructor que inicializa variables
    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
}
