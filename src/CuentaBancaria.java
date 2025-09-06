public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Se retiraron $" + cantidad);
            } else {
                System.out.println("Fondos insuficientes. No puede retirar $" + cantidad);
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}

