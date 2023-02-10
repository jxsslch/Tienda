package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    // Mapping se refiere a una busqueda
    @GetMapping("/")
    public String inicio(Model model){
        var saludo="Saludos desde el Back End";
        model.addAttribute("mensaje", saludo);
        // Se crea el objeto, para este debe hacerse el import de la clase Cliente
        Cliente cliente1=new Cliente("Juan", "Contreras", "jcontreras@gmail.com", "80804567");
        Cliente cliente2=new Cliente("Maria", "Contreras", "mcontreras@gmail.com", "60804560");
        Cliente cliente3=new Cliente("Carlos", "Contreras", "ccontreras@gmail.com", "90804667");
        // Definir varios objetos al mismo tiempo
        var clientes=Arrays.asList(cliente1, cliente2, cliente3);
        // Define el "titulo" del objeto
        model.addAttribute("clientes", clientes);
        // Va a buscar index en templates y retornar lo que tiene dentro
        return "index";
    }
}