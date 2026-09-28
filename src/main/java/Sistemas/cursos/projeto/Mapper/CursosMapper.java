package Sistemas.cursos.projeto.Mapper;


import Sistemas.cursos.projeto.DTO.CursosRequest;
import Sistemas.cursos.projeto.DTO.CursosResponse;
import Sistemas.cursos.projeto.Entity.Cursos;
import org.springframework.stereotype.Component;

@Component
public class CursosMapper {

    public Cursos toEntity(CursosRequest request) {

        return Cursos.builder()
                .nome(request.nome())
                .descricao(request.descricao())
                .cargaHoraria(request.cargaHoraria())
                .build();
    }

    public CursosResponse toResponse(Cursos cursos) {
        return new CursosResponse(
                cursos.getId(),
                cursos.getNome(),
                cursos.getDescricao(),
                cursos.getCargaHoraria()
        );
    }

    public void updateEntity(CursosRequest request , Cursos cursos) {

        cursos.setNome(request.nome());
        cursos.setDescricao(request.descricao());
        cursos.setCargaHoraria(request.cargaHoraria());
    }
}
