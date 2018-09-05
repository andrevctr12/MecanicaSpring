package unioeste.mecanica.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unioeste.mecanica.cliente.bo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
