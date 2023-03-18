package com.tienda_v1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
// Se coloca @Data y se crea el import, eso crea logicamente los gets y sets
// No se van a ver, pero los programa
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable {
    // Se utiliza para que el numero de ID se asigne solo
    private static final long serialVersionUID = 1L;
    // Llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long idArticulo;
    
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String imagen;
    private boolean activo;
    
    // Constructor default, no inicializa variables
    @JoinColumn(name="id_categoria", referencedColumnName="id_categoria")
    @ManyToOne
    private Categoria categoria;
    
    public Articulo() {
    }

    // Constructor que inicializa variables

    public Articulo(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo, Categoria categoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.imagen = imagen;
        this.activo = activo;
        this.categoria = categoria;
    }
    
}
