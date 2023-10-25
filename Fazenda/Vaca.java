package Fazenda;

public class Vaca {
   
        private String nome;
        private String corPelo;
        private int leite;
        private double consumo;
     
        public Vaca(){
            nome = " ";
            corPelo = " ";
            leite = 0;
            consumo = 0;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setCorPelo(String corPelo){
            this.corPelo = corPelo;
        }
        public void setLeite(int leite){
            this.leite = leite;
        }
        public void setConsumo(double consumo){
            this.consumo = consumo;
        }
        
        public String getNome(){
            return nome;
        }
        public String getCorPelo(){
            return corPelo;
        }
        public int getLeite(){
            return leite;
        }
        public double getConsumo(){
            return consumo;
        }
}
