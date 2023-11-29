import java.util.List;

public class EstrategiaPopular implements Estrategia{

    @Override
    public List<String> recomendarConteudos() {
        return List.of("Recomendação Popular 1", "Recomendação Popular 2", "Recomendação Popular 3");
    }
}
