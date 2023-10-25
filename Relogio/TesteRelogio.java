package Relogio;
import java.util.Scanner;

public class TesteRelogio {
    public static void main(String[] args){
        Relogio rolex;
        String formato;
        rolex = new Relogio();
        Scanner input = new Scanner(System.in);
        System.out.print("Qual formato deseja exibir?");
        formato = input.next();
        boolean formato24h = formato.equalsIgnoreCase("24h");

        if(formato24h){
            for(int h=0;h<24;h++){
                for(int m=0;m<60;m++){
                    rolex.ticTac();
                    System.out.print(rolex.getHora().getValor());
                    System.out.print(" : ");
                    System.out.println(rolex.getMinuto().getValor());

                }
            }
        }else{
            rolex.atualizaDisplay();
            for(int  i = 0; i < 24 ;i++){
                for(int j=0;j<60;j++){
                    rolex.ticTac();
                    System.out.print(rolex.getHora().getValor());
                    System.out.print(" : ");
                    System.out.print(rolex.getMinuto().getValor());
                    if( i < 12 ){
                        System.out.println(" am");
                    }else{
                        System.out.println(" pm");
                    }
                }
                 if(i==12){
                    rolex.atualizaDisplay2();
                }
                
            }
            
        
        }
        
    
    }

}
