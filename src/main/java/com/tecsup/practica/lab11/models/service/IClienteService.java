package com.tecsup.practica.lab11.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tecsup.practica.lab11.models.entities.Cliente;
import com.tecsup.practica.lab11.models.entities.Factura;
import com.tecsup.practica.lab11.models.entities.Producto;


public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public Cliente fetchByIdWithFacturas(Long id);

    public void delete(Long id);

    public List<Producto> findByNombre(String term);

    public void saveFactura(Factura factura);

    public Producto findProductoById(Long id);

    public Factura findFacturaById(Long id);

    public void deleteFactura(Long id);

    public Factura fetchFacturaByIdWithClienteWhithItemFacturaWithProducto(Long id);

}