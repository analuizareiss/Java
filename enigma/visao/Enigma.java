
package visao;

import dominio.CifraDeCesar;
import dominio.DecifragemInvalidaException;
import servicos.ManArqTexto;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class Enigma {
    
    public static void main(String[] args) throws DecifragemInvalidaException {
        CifraDeCesar cdc = new CifraDeCesar();
        Scanner input = new Scanner(System.in);
        System.out.print("Deseja digitar a frase ou ler do arquivo: ");
        String escolha = input.nextLine();
        
        if(escolha.equalsIgnoreCase("digitar a frase")){
            System.out.print("Informe a mensagem a ser cifrada: ");
            String mensagem = input.nextLine();
            
            System.out.print("Essa é a mensagem cifrada: ");
            System.out.println(cdc.cifrar(mensagem));
            String mensagemCifrada = cdc.cifrar(mensagem);
            
            System.out.print("Tente decifrá-la: ");
            String tentativa = input.nextLine();
        
            if(tentativa.equalsIgnoreCase(cdc.decifrar(mensagemCifrada))){
                System.out.println("Parabens!! Você decifrou corretamente a mensagem.");
            }else{
                throw new DecifragemInvalidaException();
            }
        }
        else if(escolha.equalsIgnoreCase("ler do arquivo")){
            ArrayList<String> conteudo = new ArrayList<>();
            conteudo.add("Tao bom te amar");
            conteudo.add("Recomeçar sem me esconder");
            conteudo.add("Atras de um ditador existe um grande amor");
            conteudo.add("Eu sempre fui apaixonado por voce");
            conteudo.add("Reinventar resplandecer o que nao apagou");
            conteudo.add("Em mim nada mudou");
            conteudo.add("Eu sei que o sonho ainda pode acontecer");

            ManArqTexto.abreGravaFecha("Reinventar", conteudo);           
            Random random = new Random();
            int aleatorio = random.nextInt(conteudo.size());
            String mensagemArquivo = conteudo.get(aleatorio);
            //System.out.println(mensagemArquivo);
            String mensagemArquivoCifrada = cdc.cifrar(mensagemArquivo);
            System.out.println("Esta é a mensagem cifrada: "+mensagemArquivoCifrada);
            System.out.print("Tente decifrá-la: ");
            String tentativa2 = input.nextLine();
            System.out.println(cdc.decifrar(mensagemArquivoCifrada));
            if(tentativa2.equalsIgnoreCase(cdc.decifrar(mensagemArquivoCifrada))){
                 System.out.println("Parabens!! Você decifrou corretamente a mensagem.");
            }else{
                throw new DecifragemInvalidaException();
            }
                        
        }   
           
    }
    
}
