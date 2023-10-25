package Carta;

public class Teste {
    public static void main(String[] args){
        int comparaV;
        boolean comparaN;
        Carta carta1 = new Carta(6,"Copas");
        /*carta1.setNaipe("Copas");
        carta1.setValor(6);*/

        Carta carta2 = new Carta();
        carta2.setNaipe("Copas");
        carta2.setValor(5);

        comparaV = carta1.compararValor(carta2);
        if(comparaV == 1 ){
            System.out.println("A carta 1 possui valor maior que a carta 2.");
        }else if(comparaV == 0){
            System.out.println("As cartas possuem valores iguais.");
        }else{
            System.out.println("A carta 1 possui valor menor que a carta 2.");
        }

        comparaN = carta1.mesmoNaipe(carta2);
        System.out.print("As Cartas possuem o mesmo naipe? "+comparaN);
 
    }
}
