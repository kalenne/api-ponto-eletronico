package com.kap.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kap.pontointeligente.api.entities.Funcionario;

@Transactional(readOnly = true)
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	Funcionario findByCpf (String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail (String cpf, String email);
}
