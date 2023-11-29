import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaRecomendacaoTest {

    Usuario usuario;
    SistemaRecomendacao sistemaRecomendacao;

    @BeforeEach
    void setUp(){
        this.usuario = new Usuario();
        this.sistemaRecomendacao = new SistemaRecomendacao();
    }

    @Test
    void deveRecomendarPupulares(){
        Estrategia estrategia = new EstrategiaPopular();
        sistemaRecomendacao.setEstrategia(estrategia);

        usuario.setRecomendacao(sistemaRecomendacao.obterRecomendacoes());

        assertEquals("Recomendação Popular 1\n" +
                "Recomendação Popular 2\n" +
                "Recomendação Popular 3\n",
                usuario.getRecomendacoes());
    }

    @Test
    void deveRecomendarHistorico(){
        Estrategia estrategia = new EstrategiaHistorico();
        sistemaRecomendacao.setEstrategia(estrategia);

        usuario.setRecomendacao(sistemaRecomendacao.obterRecomendacoes());

        assertEquals("Recomendação Personalizada 1\n" +
                        "Recomendação Personalizada 2\n" +
                        "Recomendação Personalizada 3\n",
                usuario.getRecomendacoes());
    }

    @Test
    void deveRecomendarDiversificada(){
        Estrategia estrategia = new EstrategiaDiversificada();
        sistemaRecomendacao.setEstrategia(estrategia);

        usuario.setRecomendacao(sistemaRecomendacao.obterRecomendacoes());

        assertEquals("Recomendação Diversificada 1\n" +
                        "Recomendação Diversificada 2\n" +
                        "Recomendação Diversificada 3\n",
                usuario.getRecomendacoes());
    }

}


