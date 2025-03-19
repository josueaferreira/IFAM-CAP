package com.api.api_aluno.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.api_aluno.domain.Entity.Aluno;


// Criação do repositório
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
