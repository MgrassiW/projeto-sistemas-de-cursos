package Sistemas.cursos.projeto.Mapper;

import Sistemas.cursos.projeto.DTO.MatriculaRequest;
import Sistemas.cursos.projeto.DTO.MatriculaResponse;
import Sistemas.cursos.projeto.Entity.Alunos;
import Sistemas.cursos.projeto.Entity.Cursos;
import Sistemas.cursos.projeto.Entity.Matricula;
import org.springframework.stereotype.Component;

@Component
public class MatriculaMapper {

    public Matricula toEntity(MatriculaRequest request, Alunos alunos , Cursos cursos) {

        return Matricula.builder()

                .dataMatricula(request.dataMatricula())
                .alunos(alunos)
                .cursos(cursos)
                .build();
    }

    public MatriculaResponse toResponse(Matricula matricula) {

        return new MatriculaResponse(
                matricula.getId(),
                matricula.getDataMatricula(),
                matricula.getAlunos(),
                matricula.getCursos()
        );
    }

    public void updateEntity(MatriculaRequest request , Matricula matricula ,Alunos alunos , Cursos cursos ) {

        matricula.setDataMatricula(request.dataMatricula());
        matricula.setAlunos(alunos);
        matricula.setCursos(cursos);
    }
}
