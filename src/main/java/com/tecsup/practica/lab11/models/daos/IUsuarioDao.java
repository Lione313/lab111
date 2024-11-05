package com.tecsup.practica.lab11.models.daos;

import org.springframework.data.repository.CrudRepository;

import com.tecsup.practica.lab11.models.entities.Usuario;




public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

    public Usuario findByUsername(String username);
}
