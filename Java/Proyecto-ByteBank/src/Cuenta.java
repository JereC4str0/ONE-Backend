// entidad cuenta
//    saldo
//    agencia
//    numero
//    titular

class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    // Esta variable no va a ser alterada por la instancia si no por la clase Cuenta
    private static int totalCuentas = 0;
    public Cuenta(int agencia){

        if (agencia <= 0) {
            System.out.println("no se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
            totalCuentas ++;
            System.out.println("Se crearon " + totalCuentas +" cuentas");

    }

    // Metodo depositar
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    // Metodo Retirar
    public boolean retirar(double valor) {
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }
    }

    // Metodo Transferir
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    // Metodo Obtener Saldo
    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
