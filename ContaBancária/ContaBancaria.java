
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.trim().equals("")) {
            throw new IllegalArgumentException("Numero da conta não pode ser vazio.");
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().equals("")) {
            throw new IllegalArgumentException("Titular não pode ser vazio.");
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser depositado tem que ser maior que 0.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor a ser depositado tem que ser maior que 0.");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Você não tem saldo suficiente para isso! Saldo: " + getSaldo());
        }
        this.saldo -= valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {

        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta de destino inválida!");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
