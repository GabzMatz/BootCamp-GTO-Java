public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private static int SEQUECIAL = 1;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUECIAL++;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    protected void ExtratoNotype() {
        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Numero: "+ this.numero);
        System.out.println("Saldo: "+ this.saldo);
    }
}
