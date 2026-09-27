package Sistemas.cursos.projeto.Repository;

import Sistemas.cursos.projeto.Entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepository extends JpaRepository<Cursos , Long> {
}
