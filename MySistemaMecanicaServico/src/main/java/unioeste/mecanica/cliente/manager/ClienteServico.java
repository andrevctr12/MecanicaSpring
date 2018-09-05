package unioeste.mecanica.cliente.manager;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unioeste.mecanica.cliente.bo.Cliente;
import unioeste.mecanica.cliente.repository.ClienteRepositorio;

import java.util.Optional;
import java.util.List;

@Service
public class ClienteServico {
    @Autowired
    private ClienteRepositorio repositorio;

    public Cliente salvar(Cliente cliente) {
        try {
            return repositorio.save(cliente);
        } catch (RuntimeException e) {
            throw new ServiceException("Não foi possível salvar o cliente");
        }
    }

    public void deletar(Long id) throws ServiceException {
        try {
            this.repositorio.deleteById(id);
        } catch (RuntimeException e) {
            throw new ServiceException("Não foi possível remover o cliente");
        }
    }

    public Cliente obter(Long id) throws ServiceException {
        return this.repositorio.findById(id).orElseThrow(() -> new ServiceException("Não foi possível encontrar o Cliente"));
    }

    public List<Cliente> obterTodos() {
        return repositorio.findAll();
    }

}
