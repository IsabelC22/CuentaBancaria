package model;

public class CuentaAhorros extends Cuenta {

    protected boolean activa;
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public boolean determinarEstadoCuenta() {

        boolean estadoCuenta;

        if (this.saldo > 10000) {
            estadoCuenta= true;
        } else {
            estadoCuenta= false;
        }
        return estadoCuenta;
    }


    public void consignar(float monto) {
        if (determinarEstadoCuenta()) {
            super.consignar(monto);
        } else {
            System.out.println("No se puede consignar: la cuenta está inactiva.");
        }
    }

    public void retirar(float monto){

        if (determinarEstadoCuenta()) {
            super.retirar(monto);

        }else{
            System.out.println("No se puede retirar: la cuenta esta inactiva");
        }
    }

    public void extractoMensual(){

        if(numeroRetiros>4){

            int retirosExtra = this.numeroRetiros - 4;
            float comisionExtra = retirosExtra * 1000;
            this.comisionMensual += comisionExtra;
            this.saldo -= comisionExtra;
        }

        super.extractoMensual();
        this.activa=determinarEstadoCuenta();
    }


    public void imprimir() {
        int totalTransacciones = this.numeroConsignaciones + this.numeroRetiros;

        System.out.println("=== Cuenta de Ahorros ===");
        System.out.println("Saldo actual: $" + this.saldo);
        System.out.println("Comisión mensual: $" + this.comisionMensual);
        System.out.println("Número de transacciones: " + totalTransacciones);
    }

}




