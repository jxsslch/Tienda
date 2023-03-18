package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    // Obtiene la lista de registros de la tabla categoria
    // y lo coloca en una lista de objetos Categoria
    public List<Categoria> getCategorias(boolean activo);
    
    // Obtiene el registros de la tabla categoria
    // que tiene el idCategoria pasado por el objeto categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Elimina el registros de la tabla categoria
    // que tiene el idCategoria pasado por el objeto categoria
    public void deleteCategoria(Categoria categoria);
    
    // Si el idCategoria pasado no existe o es nulo se crea
    // un registro nuevo en la tabla categoria
    // si el idCategoria existe... Se actualiza la informacion
    public void saveCategoria(Categoria categoria);
}
