package Fazenda;

public class Fazendinha {
    public static void main(String[] args){
        Cavalo cavalo1 = new Cavalo();
        cavalo1.setNome("Roberto");
        cavalo1.setCorPelo("Preto");
        cavalo1.setGalope("Galopou");
        cavalo1.setConsumo(1);

        Cavalo cavalo2 = new Cavalo();
        cavalo2.setNome("Pedro");
        cavalo2.setCorPelo("Marrom");
        cavalo2.setGalope("Galopou");
        cavalo2.setConsumo(3);
        
        System.out.println("Cavalos:");
        System.out.println("Nome: "+cavalo1.getNome());
        System.out.println("Cor do pelo: "+cavalo1.getCorPelo());
        System.out.println("Galope: "+cavalo1.getGalope());
        System.out.println("Consumo em kg: "+cavalo1.getConsumo());

        System.out.println("Nome: "+cavalo2.getNome());
        System.out.println("Cor do pelo: "+cavalo2.getCorPelo());
        System.out.println("Galope: "+cavalo2.getGalope());
        System.out.println("Consumo em kg: "+cavalo2.getConsumo());

        Vaca vaca1 = new Vaca();
        vaca1.setNome("Amanda");
        vaca1.setCorPelo("Rosa");
        vaca1.setLeite(3);
        vaca1.setConsumo(5);

        Vaca vaca2 = new Vaca();
        vaca2.setNome("Judite");
        vaca2.setCorPelo("Marrom");
        vaca2.setLeite(4);
        vaca2.setConsumo(4);

        Vaca vaca3 = new Vaca();
        vaca3.setNome("Mimosa");
        vaca3.setCorPelo("Preto");
        vaca3.setLeite(2);
        vaca3.setConsumo(3);

        System.out.println(" ");
        System.out.println("Vacas:");
        System.out.println("Nome: "+vaca1.getNome());
        System.out.println("Cor do pelo: "+vaca1.getCorPelo());
        System.out.println("Litros de leite produzido: "+vaca1.getLeite());
        System.out.println("Consumo em kg: "+vaca1.getConsumo());

        System.out.println("Nome: "+vaca2.getNome());
        System.out.println("Cor do pelo: "+vaca2.getCorPelo());
        System.out.println("Litros de leite produzido: "+vaca2.getLeite());
        System.out.println("Consumo em kg: "+vaca2.getConsumo());

        System.out.println("Nome: "+vaca3.getNome());
        System.out.println("Cor do pelo: "+vaca3.getCorPelo());
        System.out.println("Litros de leite produzido: "+vaca3.getLeite());
        System.out.println("Consumo em kg: "+vaca3.getConsumo());

        //Galinha galinha1 = new Galinha("Anastácia","Branca",3,0.3);
        Galinha galinha1 = new Galinha();
        galinha1.setNome("Anastácia");
        galinha1.setCorPena("Branca");
        galinha1.setOvos(3);
        galinha1.setConsumo(0.3);

        Galinha galinha2 = new Galinha();
        galinha2.setNome("Mel");
        galinha2.setCorPena("Branca");
        galinha2.setOvos(2);
        galinha2.setConsumo(0.4);

        Galinha galinha3 = new Galinha();
        galinha3.setNome("Larissa");
        galinha3.setCorPena("Marrom");
        galinha3.setOvos(5);
        galinha3.setConsumo(0.5);

        Galinha galinha4 = new Galinha();
        galinha4.setNome("Julia");
        galinha4.setCorPena("Cinza"); 
        galinha4.setOvos(3);
        galinha4.setConsumo(0.6);

        Galinha galinha5 = new Galinha();
        galinha5.setNome("Luiza");
        galinha5.setCorPena("Marrom");
        galinha5.setOvos(5);
        galinha5.setConsumo(0.25);

        System.out.println(" ");
        System.out.println("Galinhas:");
        System.out.println("Nome: "+galinha1.getNome());
        System.out.println("Cor da pena: "+galinha1.getCorPena());
        System.out.println("Ovos botados: "+galinha1.getOvos());
        System.out.println("Consumo em kg: "+galinha1.getConsumo());
    
        System.out.println("Nome: "+galinha2.getNome());
        System.out.println("Cor da pena: "+galinha2.getCorPena());
        System.out.println("Ovos botados: "+galinha2.getOvos());
        System.out.println("Consumo em kg: "+galinha2.getConsumo());

        System.out.println("Nome: "+galinha3.getNome());
        System.out.println("Cor da pena: "+galinha3.getCorPena());
        System.out.println("Ovos botados: "+galinha3.getOvos());
        System.out.println("Consumo em kg: "+galinha3.getConsumo());

        System.out.println("Nome: "+galinha4.getNome());
        System.out.println("Cor da pena: "+galinha4.getCorPena());
        System.out.println("Ovos botados: "+galinha4.getOvos());
        System.out.println("Consumo em kg: "+galinha4.getConsumo());

        System.out.println("Nome: "+galinha5.getNome());
        System.out.println("Cor da pena: "+galinha5.getCorPena());
        System.out.println("Ovos botados: "+galinha5.getOvos());
        System.out.println("Consumo em kg: "+galinha5.getConsumo());
        
        System.out.println("Quantidade de ração que o Sr.Mc Donald precisa comprar é: "+(cavalo1.getConsumo()+cavalo2.getConsumo()+vaca1.getConsumo()+vaca2.getConsumo()+vaca3.getConsumo()+galinha1.getConsumo()+galinha2.getConsumo()+galinha3.getConsumo()+galinha4.getConsumo()+galinha5.getConsumo()));
    }

}
