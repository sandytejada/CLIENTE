package EFSANDYTEJADA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFSANDYTEJADA.Model.Cliente;
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

}
