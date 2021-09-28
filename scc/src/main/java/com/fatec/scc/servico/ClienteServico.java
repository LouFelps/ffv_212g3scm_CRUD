package com.fatec.scc.servico;

import org.springframework.web.servlet.ModelAndView;
import com.fatec.scc.model.Cliente;
import com.fatec.scc.model.Endereco;

public interface ClienteServico {
	public Iterable<Cliente> findAll();

	public Cliente findByCpf(String cpf);

	public void deleteById(Long id);

	public Cliente findById(Long id);

	public ModelAndView saveOrUpdate(Cliente cliente);

	public Endereco obtemEndereco(String cep);
}