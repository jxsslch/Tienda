package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import com.tienda_v1.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    // Mapping se refiere a una busqueda
    @GetMapping("/")
    public String inicio(Model model){
        // Definir varios objetos al mismo tiempo
        var clientes=clienteService.getClientes();
        // Define el "titulo" del objeto
        model.addAttribute("clientes", clientes);
        // Va a buscar index en templates y retornar lo que tiene dentro
        return "index";
    }
    
    @GetMapping("/Cliente/eliminar/{idCliente}")
    public String eliminaCliente(Cliente cliente){
        clienteService.deleteCliente(cliente);
        return "redirect:/";
    }
    
    @GetMapping("/Cliente/nuevo")
    public String nuevoCliente(Cliente cliente){
        return "modificaCliente";
    }
    // Si el metodo del text imput es post, se debe usar post mapping
    @PostMapping("/Cliente/guardar")
    public String guardarCliente(Cliente cliente){
        clienteService.saveCliente(cliente);
        return "redirect:/";
    }
    
     @GetMapping("/Cliente/modificar/{idCliente}")
    public String modificaCliente(Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificaCliente";
    }
}