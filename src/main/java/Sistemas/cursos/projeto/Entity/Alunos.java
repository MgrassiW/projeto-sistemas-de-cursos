package Sistemas.cursos.projeto.Entity;


import Sistemas.cursos.projeto.Entity.Enum.ROLE;
import jakarta.persistence.*;
import lombok.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
@Builder
public class Alunos implements UserDetails {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + role));
    }

    @Override
    public @Nullable String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }
}

