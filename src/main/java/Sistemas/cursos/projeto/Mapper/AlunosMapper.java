package Sistemas.cursos.projeto.Mapper;


import Sistemas.cursos.projeto.DTO.AlunoRequest;
import Sistemas.cursos.projeto.DTO.AlunoResponse;
import Sistemas.cursos.projeto.Entity.Alunos;
import org.springframework.stereotype.Component;

@Component
public class AlunosMapper {

    public Alunos toEntity(AlunoRequest request) {

        return Alunos.builder()
                .nome(request.nome())
                .email(request.email())
                .senha(request.senha())
                .role(request.role())
                .build();
    }

    public AlunoResponse toResponse(Alunos alunos) {

        return new AlunoResponse(
                alunos.getId(),
                alunos.getNome(),
                alunos.getEmail(),
                alunos.getSenha(),
                alunos.getRole()

        );
    }
    public void updateEntity(AlunoRequest request , Alunos alunos) {

        alunos.setNome(request.nome());
        alunos.setEmail(request.email());
        alunos.setSenha(request.senha());
        alunos.setRole(request.role());
    }

}
