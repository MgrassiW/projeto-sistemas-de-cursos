package Sistemas.cursos.projeto.DTO;

import Sistemas.cursos.projeto.Entity.Enum.ROLE;

public record AlunoRequest(

        String nome,
        String email,
        String senha,
        ROLE role

) {
}
