package contabilidade;

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Passivo> pagamentos;
    private double pagamentoTotal;
    


    public ControlePagamento() {
        pagamentos = new ArrayList<>();
        pagamentoTotal = 0;
        
    }

    public ArrayList<Passivo> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }


    public double getPagamentoTotal() {
        return pagamentoTotal;
    }

    public void setPagamentoTotal(double pagamentoTotal) {
        this.pagamentoTotal = pagamentoTotal;
    }

    public void addPassivo(Passivo novo){
        pagamentos.add(novo);
    }

    public double valorConta(int dia,int mes){
        double contaTotal = 0;
        for(Passivo contas : pagamentos){
            if(contas instanceof Conta){
                if(contas instanceof Titulo){
                    contaTotal += ((Titulo)contas).getValorAPagar(dia, mes);
                }else{
                    contaTotal += ((Concessionaria)contas).getValorAPagar(0, 0);
                }
            }
        }
        return contaTotal;
    }
    
    public double valorEmpregados(){
        double empregadoTotal = 0;
        for(Passivo empregados : pagamentos){
            if(empregados instanceof Empregado){
                if(empregados instanceof Assalariado){
                    empregadoTotal += ((Assalariado)empregados).getValorAPagar(0, 0);
                }
                else if(empregados instanceof Terceirizado){
                    empregadoTotal += ((Terceirizado)empregados).getValorAPagar(0, 0); 
                }
                else if(empregados instanceof Comissionado){
                    empregadoTotal += ((Comissionado)empregados).getValorAPagar(0, 0);
                }
                else if(empregados instanceof AssalariadoComissionado){
                    empregadoTotal += ((AssalariadoComissionado)empregados).getValorAPagar(0, 0);
                }
            }
        }

        return empregadoTotal;
    }

    public double valorTotal(int dia,int mes){
        pagamentoTotal = valorConta(dia, mes) + valorEmpregados();

        return pagamentoTotal;
    }

    
}
