package model;

public class CuentaCorriente extends Cuenta {
    protected float sobregiro=0f;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(float monto){
       if (monto <= this.saldo) {
        super.retirar(monto);

    }else{
        float deuda = monto - this.saldo;
        this.saldo = 0;
        this.sobregiro += deuda;
        this.numeroRetiros++;
    }
    }
    public void consignar(float monto){
        if(this.sobregiro>0){
            if (monto >= this.sobregiro) {
                monto -= this.sobregiro;
                this.sobregiro = 0;
                super.consignar(monto);

        }else{
            this.sobregiro -= monto;
        }
    }else{
        super.consignar(monto);
    }
    }

    public void extractoMensual(){

        super.extractoMensual();
    }
    public void imprimir() {
        int totalTransacciones = this.numeroConsignaciones + this.numeroRetiros;

        System.out.println("=== Cuenta Corriente ===");
        System.out.println("Saldo actual: $" + this.saldo);
        System.out.println("Comisión mensual: $" + this.comisionMensual);
        System.out.println("Número de transacciones: " + totalTransacciones);
        System.out.println("Sobregiro: $" + this.sobregiro);
    }

}




