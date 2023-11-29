import java.util.List;

public class EstrategiaDiversificada implements Estrategia{
    @Override
    public List<String> recomendarConteudos() {
        return List.of("Recomendação Diversificada 1", "Recomendação Diversificada 2",
                "Recomendação Diversificada 3");
    }
}
