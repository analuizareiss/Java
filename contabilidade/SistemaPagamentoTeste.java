package contabilidade;

public class SistemaPagamentoTeste {
    public static void main(String[] args){
        
        Empregado assalariado = new Assalariado("Ana", "Reis", 9999999, 10);
        Empregado terceirizado = new Terceirizado("Amanda", "Reis", 8888888, 5);
        Empregado comissionado = new Comissionado("Pedro", "Santos", 7777777, 10000);
        Empregado aComissionado = new AssalariadoComissionado("Neymar", "Junior", 6666666, 50000,0 );

        Conta titulo = new Titulo(7, 10, 900);
        Conta  concessionaria = new Concessionaria(17, 10, 1000);

        ControlePagamento receita = new ControlePagamento();
        receita.addPassivo(assalariado);
        receita.addPassivo(terceirizado);
        receita.addPassivo(comissionado);
        receita.addPassivo(aComissionado);
        receita.addPassivo(titulo);
        receita.addPassivo(concessionaria);

        System.out.println("O valor total de pagamento aos empregados foi de: "+receita.valorEmpregados());
        System.out.println("O valor total de pagamentos de contas foi de: "+receita.valorConta(7, 10));
        System.out.println("O valor total pago é: " +receita.valorTotal(7,10));


    }
}
