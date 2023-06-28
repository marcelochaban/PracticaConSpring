package com.example.demo.models.dao;

import com.example.demo.models.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface IcompraDao  extends CrudRepository<Compra, Long> {
}
