import java.util.List;

public class EstrategiaHistorico implements Estrategia{
    @Override
    public List<String> recomendarConteudos() {
        return List.of("Recomendação Personalizada 1", "Recomendação Personalizada 2",
                "Recomendação Personalizada 3");
    }
}
