
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SelecaoDeCandidatos {
    public static void main(String[] args) {

        Map<String, Double> candidatosEPretensao = new HashMap<String, Double>();
        candidatosEPretensao.put("Joao", 9000D);
        candidatosEPretensao.put("Paulo", 12000D);
        candidatosEPretensao.put("Fatima", 7000D);
        candidatosEPretensao.put("Bruno", 6000D);
        candidatosEPretensao.put("Maria", 6000D);
        candidatosEPretensao.put("Joaquim", 9000D);
        candidatosEPretensao.put("Pablo", 5000D);
        candidatosEPretensao.put("Mauro", 15000D);
        candidatosEPretensao.put("Felipe", 8000D);

        ArrayList<String> candidatosDentroDaPretensao = new ArrayList<>();

        for (Map.Entry<String, Double> candidatoEntry : candidatosEPretensao.entrySet()) {
            if(candidatoEntry.getValue() <= 9000D){
                candidatosDentroDaPretensao.add(candidatoEntry.getKey());
            }
        }
        
        ArrayList<String> candidatosEscolhidos = new ArrayList<>();
        for (String candidato : candidatosDentroDaPretensao) {
            if (candidatosEscolhidos.size() < 5){
                candidatosEscolhidos.add(candidato);
            }

        }
        Collections.shuffle(candidatosEscolhidos);

        String mensagemDecisao = String.format("Foram escolhidos %s candidatos para preencher nossas vagas, segue abaixo seus nomes:", candidatosEscolhidos.size());
        System.out.println(mensagemDecisao);
        for (String candidato : candidatosEscolhidos) {
            System.out.println(candidato);
        }

    }

}



