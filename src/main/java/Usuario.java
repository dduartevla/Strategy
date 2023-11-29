import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<String> recomendacoes;

    public Usuario(){
        this.recomendacoes = new ArrayList<String>();
    }

    public void setRecomendacao(List<String> recomendacoes){
        this.recomendacoes = recomendacoes;
    }

    public String getRecomendacoes(){

        String str = "";

        for (String recomendacao : this.recomendacoes) {
            str = str + recomendacao + "\n";
        }
        return str;
    }
}
