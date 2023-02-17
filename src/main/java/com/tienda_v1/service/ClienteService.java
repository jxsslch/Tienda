package com.tienda_v1.service;

import com.tienda_v1.domain.Cliente;
import java.util.List;

public interface ClienteService {
    // Obtiene la lista de registros de la tabla cliente
    // y lo coloca en una lista de objetos Cliente
    public List<Cliente> getClientes();
    
    // Obtiene el registros de la tabla cliente
    // que tiene el idCliente pasado por el objeto cliente
    public Cliente getCliente(Cliente cliente);
    
    // Elimina el registros de la tabla cliente
    // que tiene el idCliente pasado por el objeto cliente
    public void deleteCliente(Cliente cliente);
    
    // Si el idCliente pasado no existe o es nulo se crea
    // un registro nuevo en la tabla cliente
    // si el idCliente existe... Se actualiza la informacion
    public void saveCliente(Cliente cliente);
}
