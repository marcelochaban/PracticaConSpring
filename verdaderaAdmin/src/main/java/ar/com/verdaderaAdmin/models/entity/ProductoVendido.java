package ar.com.verdaderaAdmin.models.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "productos_vendidos")
public class ProductoVendido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;
    private Integer cantidad;

}
