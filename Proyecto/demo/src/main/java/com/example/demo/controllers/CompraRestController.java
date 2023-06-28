package com.example.demo.controllers;

import com.example.demo.models.entity.Compra;
import com.example.demo.models.services.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CompraRestController {
    @Autowired
    private ICompraService compraService;

    @GetMapping("/compras")
    public List<Compra> index() {

        return compraService.findAll();
    }

    @GetMapping("/compras/{id}")
    public Compra show(@PathVariable Long id) {
        return this.compraService.findById(id);
    }

    @PostMapping("/compras")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra create(@RequestBody Compra compra) {
        compra.setCreateAt(new Date());
        this.compraService.save(compra);
        return compra;
    }

    @PutMapping("/compras/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Compra update(@RequestBody Compra compra, @PathVariable Long id) {
        Compra currentCompra = this.compraService.findById(id);
        currentCompra.setTotal(compra.getTotal());
        currentCompra.setNumeroCompra(compra.getNumeroCompra());
        currentCompra.setCliente(compra.getCliente());
        currentCompra.setProductoList(compra.getProductoList());
        this.compraService.save(currentCompra);
        return currentCompra;
    }

    @DeleteMapping("/compras/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Compra currentCompra = this.compraService.findById(id);
        this.compraService.delete(currentCompra);
    }
}
