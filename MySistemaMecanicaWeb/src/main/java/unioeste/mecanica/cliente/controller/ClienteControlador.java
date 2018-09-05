package unioeste.mecanica.cliente.controller;

import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unioeste.geral.infra.exception.ControllerException;
import unioeste.mecanica.cliente.bo.Cliente;
import unioeste.mecanica.cliente.manager.ClienteServico;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CONFLICT;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class ClienteControlador {

    @Autowired
    private ClienteServico servicos;

    @PostMapping("/cliente")
    public Cliente create(@RequestBody Cliente cliente) {
        try {
            return servicos.salvar(cliente);
        }
        catch (ServiceException e) {
            throw new ControllerException(BAD_REQUEST, e.getMessage());
        }
    }

    @PutMapping("/cliente")
    public Cliente update(@RequestBody Cliente cliente) {
        try {
            return servicos.salvar(cliente);
        }
        catch (ServiceException e) {
            throw new ControllerException(BAD_REQUEST, e.getMessage());
        }
    }

    @DeleteMapping("/cliente/{id}")
    public void delete(@PathVariable Long id) {
        try {
            servicos.deletar(id);
        }
        catch (ServiceException e) {
            throw new ControllerException(CONFLICT, e.getMessage());
        }
    }

    @GetMapping("/cliente/{id}")
    public Cliente findOne(@PathVariable Long id) {
        Cliente response;
        try {
            response = servicos.obter(id);
        }
        catch (ServiceException e) {
            throw new ControllerException(NOT_FOUND, "Cliente não encontrado");
        }

        return response;
    }

    @GetMapping(value = "/clinte")
    public List<Cliente> findAll() {
        return servicos.obterTodos();
    }

}
