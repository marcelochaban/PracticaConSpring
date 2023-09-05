package ar.com.verdaderaAdmin.models.dao;


import ar.com.verdaderaAdmin.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente , Long> {
}
