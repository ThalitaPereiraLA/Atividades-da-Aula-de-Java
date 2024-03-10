import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Conta {
    private String nome;
    private int numero;
    private int agencia;
    private double saldo;
    private String dataAbertura;
    private static int proximoIdentificador = 1;
    private int identificador;

    public Conta(String nome, int numero, int agencia, double saldo, String dataAbertura) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        if (validarData(dataAbertura)) {
            this.dataAbertura = dataAbertura;
        } else {
            System.out.println("Data de abertura inválida!");
            
        }
        this.identificador = proximoIdentificador++;
    }
    private boolean validarData(String data) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        sdf.parse(data);
        return true;
    } catch (ParseException e) {
        return false;
    }
}
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " foi adicionado a conta. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Depósito inválido, insira um valor acima de R$ 0!");
        }
    }

    public void sacar(Double valor) {
        if (valor > saldo) {
            saldo = saldo - valor;
            System.out.println("Foram retirados R$" + valor);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void calcularRendimentos() {
        double rendimento = saldo * 0.1;
        System.out.println("Seu rendimento é de R$" + rendimento);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo R$: " + saldo);
        System.out.println("Data de abertura: " + dataAbertura);
        System.out.println("Identificador: " + identificador);
    }

    public static void main(String[] args) {
        Conta contaThalita = new Conta("Thalita", 1234567, 7005, 200, "02/03/2024");
        contaThalita.depositar(100.00);
        contaThalita.calcularRendimentos();
        contaThalita.exibirInformacoes();
        contaThalita.getIdentificador();
        Conta contaJoão = new Conta ("João", 678978,  9018, 300,  "01/03/2024");
        contaJoão.depositar(100.00);
        contaJoão.calcularRendimentos();
        contaJoão.exibirInformacoes();
        contaJoão.getIdentificador();
    }
}