package ar.com.verdaderaAdmin.models.services;

import ar.com.verdaderaAdmin.models.entity.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> listarClientes();
    public void save(Cliente cliente);
    public void delete(Cliente cliente);
    public Cliente findCliente(Cliente cliente);

}
