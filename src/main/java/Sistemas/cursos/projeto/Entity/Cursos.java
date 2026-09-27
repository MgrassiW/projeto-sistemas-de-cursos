package Sistemas.cursos.projeto.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cursos")
@Builder
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome" , nullable = false)
    private String nome;

    @Column(name = "descricao" , nullable = false)
    private String descricao;

    @Column(name = "carga_horaria" , nullable = false)
    private int cargaHoraria;

    @OneToMany(mappedBy = "cursos")
    private Set<Matricula> matriculas;

}
