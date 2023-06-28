package com.example.demo.models.services;

import com.example.demo.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();

    public void save(Producto producto);

    public Producto findById(Long id);

    public void delete(Producto producto);
}
