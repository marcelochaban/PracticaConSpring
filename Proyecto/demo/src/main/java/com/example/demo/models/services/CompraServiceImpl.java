package com.example.demo.models.services;

import com.example.demo.models.dao.IcompraDao;
import com.example.demo.models.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompraServiceImpl implements ICompraService{
    @Autowired
    private IcompraDao compraDao;

    @Override
    @Transactional(readOnly = true)
    public List<Compra> findAll() {
        return (List<Compra>) compraDao.findAll();
    }

    @Override
    @Transactional
    public void save(Compra compra) {
        compraDao.save(compra);
    }

    @Override
    @Transactional(readOnly = true)
    public Compra findById(Long id) {
        return compraDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Compra compra) {
        compraDao.delete(compra);

    }
}

