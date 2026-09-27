package Sistemas.cursos.projeto.Entity;


import Sistemas.cursos.projeto.Entity.Enum.ROLE;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
@Builder
public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome" , nullable = false)
    private String nome;

    @Column(name = "email" , nullable = false , unique = true)
    private String email;

    @Column(name = "senha" , nullable = false)
    private String senha;

    @Enumerated
    @Column(name = "role")
    private ROLE role;

    @OneToMany(mappedBy = "alunos")
    private Set<Matricula> matriculas;

}

