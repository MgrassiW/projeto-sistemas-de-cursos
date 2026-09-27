package Sistemas.cursos.projeto.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "matriculas")
@Builder
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_matricula" , nullable = false)
    private LocalDateTime dataMatricula;

    @ManyToOne
    @JoinColumn(name = "aluno_id" ,nullable = false)
    private Alunos alunos;

    @ManyToOne
    @JoinColumn(name = "curso_id" , nullable = false)
    private Cursos cursos;


}
