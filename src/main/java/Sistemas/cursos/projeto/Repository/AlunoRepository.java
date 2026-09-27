package Sistemas.cursos.projeto.Repository;

import Sistemas.cursos.projeto.Entity.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Alunos , Long> {
}
