package com.kap.pontointeligente.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kap.pontointeligente.api.entities.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Transactional(readOnly=true)
	Empresa findByCnpj(String cnpj);

}
