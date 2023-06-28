package com.example.demo.models.services;

import com.example.demo.models.entity.Compra;

import java.util.List;

public interface ICompraService {
    public List<Compra> findAll();

    public void save(Compra compra);

    public Compra findById(Long id);

    public void delete(Compra compra);
}
