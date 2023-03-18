package com.tienda_v1.service;

import com.tienda_v1.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    // Obtiene la lista de registros de la tabla articulo
    // y lo coloca en una lista de objetos Articulo
    public List<Articulo> getArticulos(boolean activo);
    
    // Obtiene el registros de la tabla articulo
    // que tiene el idArticulo pasado por el objeto articulo
    public Articulo getArticulo(Articulo articulo);
    
    // Elimina el registros de la tabla articulo
    // que tiene el idArticulo pasado por el objeto articulo
    public void deleteArticulo(Articulo articulo);
    
    // Si el idArticulo pasado no existe o es nulo se crea
    // un registro nuevo en la tabla articulo
    // si el idArticulo existe... Se actualiza la informacion
    public void saveArticulo(Articulo articulo);
}
