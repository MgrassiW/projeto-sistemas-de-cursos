package Sistemas.cursos.projeto.DTO;

import Sistemas.cursos.projeto.Entity.Enum.ROLE;

public record AlunoResponse(

        Long id,
        String nome,
        String email,
        String senha,
        ROLE role
) {}
