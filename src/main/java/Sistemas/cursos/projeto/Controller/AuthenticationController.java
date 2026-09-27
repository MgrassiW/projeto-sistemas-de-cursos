package Sistemas.cursos.projeto.Controller;

import Sistemas.cursos.projeto.DTO.LoginResquest;
import Sistemas.cursos.projeto.Entity.Alunos;
import Sistemas.cursos.projeto.Service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final JwtService service;

    @PostMapping("/auth/login")
    public String Login (LoginResquest resquest) {

        var authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        resquest.email(),
                        resquest.senha()
                )
        );

        Alunos alunos = (Alunos) authentication.getPrincipal();

        return service.gerarToken(alunos);
    }
}
