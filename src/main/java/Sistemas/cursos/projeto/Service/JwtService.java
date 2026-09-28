package Sistemas.cursos.projeto.Service;

import Sistemas.cursos.projeto.Entity.Alunos;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {

    @Value("${api.security.token.secret}")
    private String secretToken;

    private SecretKey getKey() {
        return Keys.hmacShaKeyFor(
                Decoders.BASE64.decode(secretToken)
        );
    }

    public String gerarToken(Alunos alunos) {

        return Jwts.builder()
                .subject(alunos.getEmail())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 2 * 60 * 60 *1000))
                .signWith(getKey())
                .compact();
    }

    public String validarToken(String token) {

        try {
            return Jwts.parser()
                    .verifyWith(getKey())
                    .build()
                    .parseSignedClaims(token)
                    .getPayload()
                    .getSubject();
        }
        catch (JwtException e) {

            System.out.printf("Erro em JwtService :%s%n" , e.getMessage());

            return null;
        }

    }
}
