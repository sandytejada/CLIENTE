package EFSANDYTEJADA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EFSANDYTEJADA.Model.Cliente;
import EFSANDYTEJADA.Repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);
		
	}
	
	

}
