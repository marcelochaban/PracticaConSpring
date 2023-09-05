package ar.com.verdaderaAdmin.models.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Date;


@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "ventas")
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    private List<ProductoVendido> productosVendidos;

    // Getters y setters (omitiendo para simplificar)
}
