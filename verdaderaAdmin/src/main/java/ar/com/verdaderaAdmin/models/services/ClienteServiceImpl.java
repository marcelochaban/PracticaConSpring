package ar.com.verdaderaAdmin.models.services;

import ar.com.verdaderaAdmin.models.dao.IClienteDao;
import ar.com.verdaderaAdmin.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private IClienteDao clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarClientes() {

        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getId()).orElse(null);
    }
}
