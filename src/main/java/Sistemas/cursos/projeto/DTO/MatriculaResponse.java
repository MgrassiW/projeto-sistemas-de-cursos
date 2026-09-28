package Sistemas.cursos.projeto.DTO;

import Sistemas.cursos.projeto.Entity.Alunos;
import Sistemas.cursos.projeto.Entity.Cursos;

import java.time.LocalDateTime;

public record MatriculaResponse(
        Long id,
        LocalDateTime dataMatricula,
        Alunos aluno,
        Cursos Cursos
) {
}
