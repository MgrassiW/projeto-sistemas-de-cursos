package Sistemas.cursos.projeto.DTO;

import java.time.LocalDateTime;

public record MatriculaResponse(
        Long id,
        LocalDateTime dataMatricula,
        AlunoResponse aluno,
        CursosResponse Cursos
) {
}
