package SuporteTec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class SuporteTecnico {
    private HashMap<String,String> bancoSolucoes;
    private ArrayList<String> respostaPadrao;

    public SuporteTecnico(){
        HashMap<String,String> bancoSolucoes = new HashMap<>();
        ArrayList<String> respostaPadrao = new ArrayList<>();

    }

    private void preencherSolucao(){
        bancoSolucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade do seu processador deve resolver o problema de performance. Você tem algum problema com o software?");
        bancoSolucoes.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está executando algum outro processo em paralelo?");
        bancoSolucoes.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema com mais detalhes?");
        bancoSolucoes.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema com mais detalhes?");
        bancoSolucoes.put("windows", "Este é um problema do sistema operacional Windows. Por favor,  entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor,  entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado e comparou todas as características do nosso software com outras ofertas de mercado?");
        bancoSolucoes.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados que farão todo o trabalho para você. Você já leu as instruções de instalação?");
        bancoSolucoes.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que a memória requerida é 1.5 giga byte. Você deverá adquirir mais memória. Mais alguma coisa que deseja saber?");
        bancoSolucoes.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas. Muitos deles dizem respeito a versões incompatíveis. Você poderia ser mais preciso?");
        bancoSolucoes.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico no seu sistema. Diga-me sobre sua configuração.");
        bancoSolucoes.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico no seu sistema. Diga-me sobre sua configuração.");

    }

    private void preencherResposta(){
        respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
        respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        respostaPadrao.add("Preciso de maiores informações a respeito.");
        respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
        respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
        respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        respostaPadrao.add("Você poderia explicar melhor?");


    }

    public String buscarSolucao(HashSet<String> palavras){
        for(String palavra : palavras){
            String solucao = bancoSolucoes.get(palavra);
            if(solucao == null){
                return solucao;
            }
        }

        if(!respostaPadrao.isEmpty()){
            Random random = new Random();
            int busca = random.nextInt(respostaPadrao.size());
            return respostaPadrao.get(busca);
        } 
        
        return "Nenhuma solução disponivel.";
    }

}
