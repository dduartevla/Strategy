import java.util.List;

public class SistemaRecomendacao {

    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public List<String> obterRecomendacoes(){
        return estrategia.recomendarConteudos();
    }
}
