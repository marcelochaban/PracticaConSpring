package ar.com.verdaderaAdmin.models.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precioCosto;
    private String categoria;

}
