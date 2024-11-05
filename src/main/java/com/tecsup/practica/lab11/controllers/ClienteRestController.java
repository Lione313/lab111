package com.tecsup.practica.lab11.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecsup.practica.lab11.models.service.IClienteService;
import com.tecsup.practica.lab11.views.ClienteList;
import com.tecsup.practica.lab11.models.daos.IClienteDao;
import java.util.List;
import com.tecsup.practica.lab11.models.service.IClienteService;


//@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping(value = "/listar")
    public ClienteList listar() {
        return new ClienteList(clienteService.findAll());
    }
}