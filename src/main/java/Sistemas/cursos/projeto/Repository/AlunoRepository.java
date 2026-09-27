package Sistemas.cursos.projeto.Repository;

import Sistemas.cursos.projeto.Entity.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Alunos , Long> {

    Optional<Alunos> findByEmail(String email);
}
