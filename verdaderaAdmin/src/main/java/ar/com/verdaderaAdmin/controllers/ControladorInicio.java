package ar.com.verdaderaAdmin.controllers;

import ar.com.verdaderaAdmin.models.dao.IClienteDao;
import ar.com.verdaderaAdmin.models.entity.Cliente;
import ar.com.verdaderaAdmin.models.services.ClienteServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    ClienteServiceImpl clienteService;

    private List <Cliente> clientes;

    @GetMapping("/")
    public String inicio(Model model){
        clientes=clienteService.listarClientes();
        log.info(""+clientes.size());
        model.addAttribute("clientes",clientes);
        return "index";
    }
}
