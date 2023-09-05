package ar.com.verdaderaAdmin.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private Integer cantidad;
    private Date fechaActualizacion;

}
