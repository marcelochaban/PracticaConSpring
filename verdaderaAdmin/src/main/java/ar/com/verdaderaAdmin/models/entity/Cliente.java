package ar.com.verdaderaAdmin.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    @OneToMany(mappedBy = "cliente")
    private List<Venta> historialDeCompra;
}
