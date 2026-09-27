package Sistemas.cursos.projeto.DTO;

import java.time.LocalDateTime;

public record MatriculaRequest (
        LocalDateTime dataMatricula,
        Long idAluno,
        Long idCursos
){
}
