public class Conta {
    // Atributos
    private String nome;
    private int numero;
    private int agencia;
    private double saldo;
    private String dataAbertura;
    
    // Construtor
    public Conta(String nome, int numero, int agencia, double saldo, String dataAbertura) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }
    
    // Métodos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " foi adicionado à conta. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Depósito inválido, insira um valor acima de R$ 0!");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Foram retirados R$ " + valor);
        } else {
            System.out.println("Valor inválido");
        }
    }
    
    public void calcularRendimentos() {
        double rendimento = saldo * 0.1;
        System.out.println("Seu rendimento é de R$ " + rendimento);
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo R$: " + saldo);
        System.out.println("Data de abertura: " + dataAbertura);
    }
    
    public static void main(String[] args) {
        Conta contaThalita = new Conta("Thalita", 1234567, 7005, 200, "28/02/2024");
        contaThalita.depositar(100.0);
        contaThalita.calcularRendimentos();
        contaThalita.exibirInformacoes();
    }
}